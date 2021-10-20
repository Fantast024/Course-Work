package Check_Program;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller_Check {
    private TextFlow textFlow1 = new TextFlow(), textFlow2 = new TextFlow();
    int key = 0;
    File fileOutput, fileInput;
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public void loadFileForCheck(File file){
        fileInput = file;
        loadFile();
    }

    public void loadFile()
    {
        try (Scanner input = new Scanner(fileInput)) {
            while (input.hasNextLine()) {
                String[] str = input.nextLine().split(" ");
                for(int i = 0; i<str.length; i++)
                {
                    Text text = new Text();
                    if(str[i].equals(";") || str[i].equals("{") || str[i].equals("}") || str[i].equals("begin"))
                    {
                        text.setText(str[i] + "\n");
                        textFlow1.getChildren().addAll(text);
                    } else
                    {
                        text.setText(str[i] + " ");
                        textFlow1.getChildren().addAll(text);
                    }
                }
            }
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    public void test(TextFlow text)
    {
        textFlow2 = text;
        fileOutput = new File(String.valueOf(textFlow2));
    }

    public File getOutput()
    {
        fileOutput = fileInput;
        return fileOutput;
    }

    public void setKey(int key){
        this.key = key;
    }

    public int getKey()
    {
        return this.key;
    }
}
