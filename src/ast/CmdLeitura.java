package ast;


import datastructures.IsiVariable;

public class CmdLeitura extends AbstractCommand {

    private String id;
    private IsiVariable var;

    public CmdLeitura (String id, IsiVariable var) {
        this.id = id;
        this.var = var;
    }
    @Override
    public String generateJavaCode() {
        return id +"= _key." + (var.getType()==IsiVariable.NUMBER? "nextDouble();": "nextLine();");
    }
    @Override
    public String toString() {
        return "CommandLeitura [id=" + id + "]";
    }

}
