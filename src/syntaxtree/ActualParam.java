package syntaxtree;

public class ActualParam extends AstNode{
	
	Var var;
	Expression exp;
	
    public ActualParam (Var var, Expression exp) {
    	super();
    	this.var = var;
    	this.exp = exp;
    }

    public String printAst(String prefix) {
        String ret = prefix + "(ACTUAL_PARAM ";
        if (var != null) ret += var.printAst("").trim();
        if (exp != null) ret += "\n" + exp.printAst(prefix + "\t");
        ret += ")\n";
        return ret;
    }
}
