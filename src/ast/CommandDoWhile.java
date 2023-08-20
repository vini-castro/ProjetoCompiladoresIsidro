package ast;

import java.util.ArrayList;

public class CommandDoWhile extends AbstractCommand{

    private String condition;
    private ArrayList<AbstractCommand> listaWhile;

    public CommandDoWhile(String condition, ArrayList<AbstractCommand> listaWhile){
        this.condition = condition;
        this.listaWhile = listaWhile;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("do {\n");
        for(AbstractCommand cmd: listaWhile){
            str.append("\t"+cmd.generateJavaCode());
        }
        str.append("}\n");
        str.append("while ("+condition+");\n");


        return str.toString();
    }
}
