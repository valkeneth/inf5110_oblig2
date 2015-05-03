package syntaxtree;

import bytecode.type.*;

public class Param extends AstNode{

    String name;
    Type type;
    boolean ref;
    
    public Param (String name, Type type, boolean ref) {
    	super();
    	this.name = name;
    	this.type = type;
    	this.ref = ref;
    	Symbol sym = new Symbol(name, type.getName(), "variable");
    	symbolTable.add(sym);
    }
    
    public void genCode() {
    	if (belProc != null) {
    		if (type.getName().equals("int")) {
        		belProc.addParameter(name, IntType.TYPE);
    		}
    		else if (type.getName().equals("string")) {
        		belProc.addParameter(name, StringType.TYPE);
    		}
    		else {
    			belProc.addParameter(name, new RefType(codeFile.structNumber(type.getName())));
    		}
    	codeFile.updateProcedure(belProc);
    	}
    }
    
    public String getType() {
    	return type.getName();
    }
   
    public String printAst(String prefix) {
        return prefix + "(PARAM_DECL " + (ref ? "ref" : "") + type.printAst("") + "(NAME " + name + "))\n";
    }
}
