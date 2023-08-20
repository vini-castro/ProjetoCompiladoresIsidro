package ast;

import java.util.ArrayList;

public class CommandDecisao extends AbstractCommand {

    private String condition;
    private ArrayList<AbstractCommand> listaTrue;
    private ArrayList<AbstractCommand> listaFalse;

    public CommandDecisao(String condition, ArrayList<AbstractCommand> listaTrue, ArrayList<AbstractCommand> listaFalse) {
        this.condition = condition;
        this.listaTrue = listaTrue;
        this.listaFalse = listaFalse;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("if ("+condition+") {\n");
        for(AbstractCommand cmd: listaTrue){
            str.append(cmd.generateJavaCode());
        }
        str.append("}\n");
        if(listaFalse.size() > 0){
            str.append("else {\n");
            for(AbstractCommand cmd: listaFalse){
                str.append(cmd.generateJavaCode());
            }
            str.append("}\n");
        }
        return str.toString();
    }
}
