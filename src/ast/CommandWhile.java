package ast;

import java.util.ArrayList;

public class CommandWhile extends AbstractCommand{

    private String condition;
    private ArrayList<AbstractCommand> listaWhile;

    public CommandWhile(String condition, ArrayList<AbstractCommand> listaWhile){
        this.condition = condition;
        this.listaWhile = listaWhile;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("while ("+condition+") {\n");
        for(AbstractCommand cmd: listaWhile){
            str.append("\t"+cmd.generateJavaCode());
        }
        str.append("}\n");

        return str.toString();
    }
}
