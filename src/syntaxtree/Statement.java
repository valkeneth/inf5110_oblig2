package syntaxtree;

public class Statement extends AstNode{

	Statement stmt;
	
    public Statement (Statement statement) {
    	super();
    	this.stmt = statement;
    	if (stmt != null) {
    		stmt.setParent(this);
    	}
    }
    
    
    public void genCode() {
    	stmt.belProc = belProc;
    	if (stmt instanceof AssignStatement) stmt.genCode();
    	if (stmt instanceof ReturnStatement) stmt.genCode();
    }
    
    public Statement getStatement() {
    	return stmt;
    }

    public String printAst(String prefix) {
        return stmt.printAst(prefix);
    }
    
    @Override
    public void checkParentSem() {
    	stmt.checkParentSem();
    }
}
