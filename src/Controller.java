import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public TextField nameFileField;
    File fileInput = null;
    MyListener myListener = new MyListener();
    public TextFlow fieldCode;
    public TextFlow fieldResult;

    public void loadFile()
    {
        fileInput = new File("src/testFiles/" + nameFileField.getText());
        try (Scanner input = new Scanner(fileInput)) {
            while (input.hasNextLine()) {
                String[] str = input.nextLine().split(" ");
                for(int i = 0; i<str.length; i++)
                {
                    Text text = new Text();
                    if(str[i].equals(";") || str[i].equals("{") || str[i].equals("}"))
                    {
                        text.setText(str[i] + "\n");
                    } else
                    {
                        text.setText(str[i] + " ");
                    }
                    fieldCode.getChildren().addAll(text);
                }
            }
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        myListener.controller_check.loadFileForCheck(fileInput);
    }

    public void runCode() {
        if (fileInput == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка!");
            alert.setHeaderText(null);
            alert.setContentText("Не загружен файл для тестирования!");
            alert.showAndWait();
            System.out.println("Не загрузился файл с кодом");
            System.exit(2);
        } else {

            try {
                org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(fileInput.getAbsolutePath());
                myListener.controller_check.test(fieldResult);

                myJavaLexer lexer = new myJavaLexer(input);
                myJavaParser parser = new myJavaParser(new CommonTokenStream(lexer));
                parser.addParseListener(myListener);
                parser.program();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                if (fileInput != myListener.controller_check.getOutput() || myListener.controller_check.getKey() == 1) {
                    alert.setTitle("Не соответские!");
                    alert.setHeaderText(null);
                    alert.setContentText("В процессе проверки в коде обнаружены ошибки!");
                    alert.showAndWait();

                } else {

                    alert.setTitle("Успех!");
                    alert.setHeaderText(null);
                    alert.setContentText("В процессе проверки в коде ошибки не обнаружены!");
                    alert.show();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            fieldResult.getChildren().addAll(myListener.texts);
        }
    }

    public void helpMessage(MouseEvent actionEvent) {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("helper.fxml"));
            stage.setTitle("Справка");
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
