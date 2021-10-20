package Check_Program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_Check extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample_Check.fxml"));
        primaryStage.setTitle("Какое-то приложение");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
