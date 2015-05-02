package syntaxtree;

public class Var extends AstNode{

    Expression exp;
    String name;
    
    public Var (String name) {
    	super();
    	this.name = name;
    }

    public Var (Expression exp, String name) {
    	super();
    	this.exp = exp;
    	this.name = name;
    }
    
    public String printAst(String prefix) {
    	if (exp == null) {
    		return prefix + "(NAME " + name + ")\n";
    	}
    	else {
    		return prefix + "(. " + exp.printAst("").trim() + " (NAME " + name + ")\n";
    	}
    }
}
