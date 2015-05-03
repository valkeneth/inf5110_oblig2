package syntaxtree;
import bytecode.instructions.*;

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
    
    public String getName() {
    	return this.name;
    }
    
    public void genCode() {
    	if (belProc == null) return;
    	String varName = "";
    	if (exp != null) varName += exp.getName() + ".";
    	varName += name;
    	belProc.addInstruction(new LOADLOCAL(belProc.variableNumber(varName)));
    }
    
    @Override
    public String getType() {
    	String types = "";
    	for (int i = 0; i < symbolTable.size(); i++) {
    		if (symbolTable.get(i).name.equals(this.name)) types += symbolTable.get(i).type;
    	}
    	return types;
    }
}
