package syntaxtree;
import bytecode.type.*;

public class VarDecl extends AstNode{

    String name;
    Type type;
    
    public VarDecl (String name, Type type) {
    	super();
    	this.name = name;
    	this.type = type;
    	Symbol sym = new Symbol(name, type.getName(), "variable");
    	symbolTable.add(sym);
    	printSymbols();
    }
    
    public void genCode() {
    	if (belStruct == null && belProc != null) { //procedure
    		if (this.type.getName().equals("int")) {
    			belProc.addLocalVariable(name, IntType.TYPE);
    		}
    		else if (this.type.getName().equals("float")) {
    			belProc.addLocalVariable(name, FloatType.TYPE);
    		}
    		else if (this.type.getName().equals("string")) {
    			belProc.addLocalVariable(name, StringType.TYPE);
    		}
    		else {
    			belProc.addLocalVariable(name, new RefType (codeFile.structNumber(type.getName())));
    		}
			codeFile.updateProcedure(belProc);
    	}
    	else if (belStruct == null && belProc == null) { // global
    		codeFile.addVariable(name);
    		codeFile.updateVariable(name, new RefType (codeFile.structNumber(type.getName())));
    	}
    	else { //structure
    		if (this.type.getName().equals("int")) {
    			belStruct.addVariable(name, IntType.TYPE);
    			codeFile.updateStruct(belStruct);
    		}
    		if (this.type.getName().equals("float")) {
    			belStruct.addVariable(name, FloatType.TYPE);
    			codeFile.updateStruct(belStruct);
    		}
    	}
    }

    @Override
    public String printAst(String prefix) {
        return prefix + "(VAR_DECL " + type.printAst("") + "(NAME " + name + "))\n";
    }
    
    
}
