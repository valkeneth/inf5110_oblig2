package syntaxtree;

public class ReturnStatement extends Statement{
	
	Expression exp;
	
    public ReturnStatement (Expression exp) {
    	super(null);
    	super.stmt = this;
    	this.exp = exp;
    }

    public String printAst(String prefix) {
        String ret = prefix + "(RETURN_STMT\n";
        if (exp != null) ret += exp.printAst(prefix + "\t");
        ret += prefix + ")\n";
        return ret;
    }
}
