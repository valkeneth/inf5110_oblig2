package syntaxtree;

public class LogOp extends AstNode{

    String type;
    
    public LogOp (String type) {
    	super();
    	this.type = type;
    }

    public String printAst(String prefix) {
        return "(LOG_OP " + type;
    }
}
