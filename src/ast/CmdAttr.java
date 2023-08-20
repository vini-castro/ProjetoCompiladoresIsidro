package ast;

import ast.AbstractCommand;

public class CmdAttr extends AbstractCommand {

    private String id;
    private String expr;

    public CmdAttr(String id, String expr) {
        this.id = id;
        this.expr = expr;
    }
    @Override
    public String generateJavaCode() {
        return id + " = "+expr+";";
    }
    @Override
    public String toString() {
        return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
    }



}
