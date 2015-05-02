package syntaxtree;

public class WhileStatement extends Statement{
	
	Expression exp;
	
    public WhileStatement (Expression exp, Statement stmt) {
    	super(null);
    	super.stmt = this;
    	this.stmt = stmt;
    	this.exp = exp;
    	if (exp != null) {
    		if (!exp.getType().equals("bool")) semErrors.add("While expression expects boolean");
    	}
    }

    public String printAst(String prefix) {
        String ret = prefix + "(WHILE_STMT\n";
        ret += exp.printAst(prefix + "\t");
        ret += stmt.printAst(prefix + "\t\t");
        ret += prefix + ")\n";
        return ret;
    }
}
