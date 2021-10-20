import Check_Program.Controller_Check;
import javafx.scene.control.Alert;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends myJavaBaseListener {
    private Map<String, Integer> variables;
    public ArrayList<Text> texts = new ArrayList<Text>();
    public int error = 0;
    public Controller_Check controller_check = new Controller_Check();
    public MyListener()
    {
        variables = new HashMap<>();
    }
    Alert alert = new Alert(Alert.AlertType.ERROR);

    @Override
    public void exitAssign(myJavaParser.AssignContext ctx)
    {
        String variableName = ctx.ID(0).getText();
        String value = ctx.ID().size()>1 ?
                ctx.ID(1).getText():
                ctx.NUMBER().getText();
        //let a be b
        if(ctx.ID().size()>1)
            variables.put(variableName,variables.get(value));
        else
            variables.put(variableName,Integer.parseInt(value));
    }

    @Override
    public void exitAdd(myJavaParser.AddContext ctx)
    {
        String variableName = ctx.ID(0).getText();

        int value = ctx.ID().size() >1?
                variables.get(ctx.ID(1).getText()):
                Integer.parseInt(ctx.NUMBER().getText());
        variables.put(variableName, variables.get(variableName) + value);
    }

    @Override
    public void exitSub(myJavaParser.SubContext ctx)
    {
        String variableName = ctx.ID(0).getText();

        int value = ctx.ID().size() >1?
                variables.get(ctx.ID(1).getText()):
                Integer.parseInt(ctx.NUMBER().getText());
        variables.put(variableName, variables.get(variableName) - value);
    }

    @Override
    public void exitMul(myJavaParser.MulContext ctx) {
        String variableName = ctx.ID(0).getText();

        int value = ctx.ID().size() >1?
                variables.get(ctx.ID(1).getText()):
                Integer.parseInt(ctx.NUMBER().getText());
        variables.put(variableName, variables.get(variableName) * value);
    }

    @Override
    public void exitDiv(myJavaParser.DivContext ctx) {
        alert.setTitle("Не соответские!");
        alert.setHeaderText(null);
        alert.setContentText("В процессе проверки в коде обнаружены ошибки!");
        String variableName = ctx.ID(0).getText();

            int value = ctx.ID().size() > 1 ?
                    variables.get(ctx.ID(1).getText()) :
                    Integer.parseInt(ctx.NUMBER().getText());
            if(value != 0) {
                variables.put(variableName, variables.get(variableName) / value);
            }else{
                controller_check.setKey(error = 1);
                System.out.println("У программы нет возможности делить на 0!!!");
                alert.showAndWait();
                System.exit(1);
            }
    }

    @Override
    public void exitPrint(myJavaParser.PrintContext ctx)
    {
        String output = "";
        Text result = new Text();
        if(ctx.ID() == null){
            output = ctx.NUMBER().getText();
            result.setText(output + "\n");
        }else {
            output = variables.get(ctx.ID().getText()).toString();
            result.setText(ctx.ID().getText() + " = " + output + "\n");
        }
        texts.add(result);
        //System.out.println(output);
    }
}
