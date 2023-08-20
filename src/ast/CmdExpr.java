package ast;

public class CmdExpr extends AbstractCommand {

    private String id;
    private String expr;

    public CmdExpr(String id, String expr) {
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