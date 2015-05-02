package syntaxtree;

public class AritOp extends AstNode{

    String type;
    
    public AritOp (String type) {
    	super();
    	this.type = type;
    }

    public String printAst(String prefix) {
        return "(ARIT_OP " + type;
    }
}
