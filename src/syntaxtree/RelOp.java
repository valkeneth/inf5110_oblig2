package syntaxtree;

public class RelOp extends AstNode{

    String type;
    
    public RelOp (String type) {
    	super();
    	this.type = type;
    }
    
    public String getType() {
    	return "RelOp";
    }

    public String printAst(String prefix) {
        return "(REL_OP " + type;
    }
}
