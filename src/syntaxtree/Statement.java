package syntaxtree;

public class Statement extends AstNode{

	Statement stmt;
	
    public Statement (Statement statement) {
    	super();
    	this.stmt = statement;
    }

    public String printAst(String prefix) {
        return stmt.printAst(prefix);
    }
}
