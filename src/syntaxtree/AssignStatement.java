package syntaxtree;

public class AssignStatement extends Statement{
	
	Var var;
	Expression exp;
	
    public AssignStatement (Var var, Expression exp) {
    	super(null);
    	super.stmt = this;
    	this.var = var;
    	this.exp = exp;
    }

    public String printAst(String prefix) {
        String ret = prefix + "(ASSIGN_STMT\n";
        ret += var.printAst(prefix + "\t");
        ret += exp.printAst(prefix + "\t");
        ret += prefix + ")\n";
        return ret;
    }
}
