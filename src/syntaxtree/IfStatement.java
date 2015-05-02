package syntaxtree;

public class IfStatement extends Statement{
	
	Expression exp;
	
    public IfStatement (Expression exp, Statement stmt) {
    	super(null);
    	super.stmt = this;
    	this.stmt = stmt;
    	this.exp = exp;
    	if (exp != null) {
    		if (!exp.getType().equals("bool")) semErrors.add("If expression expects boolean");
    	}
    }

    public String printAst(String prefix) {
        String ret = prefix + "(IF_STMT\n";
        ret += exp.printAst(prefix + "\t");
        ret += stmt.printAst(prefix + "\t\t");
        ret += prefix + ")\n";
        return ret;
    }
}
