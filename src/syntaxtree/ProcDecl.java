package syntaxtree;
import java.util.List;
import java.util.LinkedList;
import bytecode.*;
import bytecode.type.*;

public class ProcDecl extends AstNode{

    String name;
    Type type2;
    List<AstNode> children = new LinkedList();
    
    public ProcDecl (String name, Type type, List<AstNode> param_list, List<AstNode> decl_list, List<AstNode> stmt_list) {
    	super();
    	Symbol sym = null;
    	this.name = name;
    	this.type2 = type;
    	if (param_list != null) this.children.addAll(param_list);
    	if (name.equals("Main") && param_list != null) semErrors.add("main function declared with parameters");
    	if (decl_list != null) this.children.addAll(decl_list);
    	if (stmt_list != null) this.children.addAll(stmt_list);
    	if (type != null) {
        	this.type = type.getName();
    		String tname = type.getName();
    		boolean inSymbols = false;
    		for (int i = 0; i < symbolTable.size(); i++) {
    			if (symbolTable.get(i).name.equals(tname)) {
    				inSymbols = true;
    			}
    		}
    		if (tname.equals("float") || tname.equals("int") || tname.equals("string") ||
    				tname.equals("bool") || tname.equals("null") || inSymbols) {
            	sym = new Symbol(name, tname, "method");
    		}
    		else {
    			semErrors.add("Undeclared return type: " + tname);
    		}	
    		if (stmt_list != null) {
        		boolean retFound = false;
	    		for (int x = 0; x < stmt_list.size(); x++) {
	    			if (stmt_list.get(x) instanceof Statement) {
	    				Statement st = (Statement)stmt_list.get(x);
	    				if (st.getStatement() instanceof ReturnStatement) {
	    					retFound = true;
	    					if (name.equals("Main") && type != null) semErrors.add("main function declared with return type");
	    					
	    				}
	    			}
	    		}
	    		if (!retFound) semErrors.add("Missing return statement for function " + name);
    		}
    		else {
    			semErrors.add("Missing return statement for function " + name);
    		}
    	}
    	else {
    		sym = new Symbol(name, "", "method");
    	}
    	
    	//param signature
    	if (param_list != null) {
    		String paramsign = "";
    		for (int j = 0; j < param_list.size(); j++) {
        		paramsign += (paramsign.equals("") ? "" : ",") + param_list.get(j).getType();
        	}
    		if (sym != null) {
    			sym.setParams(paramsign);
    		}
    	}
    	if (sym != null) symbolTable.add(sym);
    	
    	
    	for (int j = 0; j < children.size(); j++) {
    		children.get(j).setParent(this);
    		children.get(j).checkParentSem();
    	}
    	
    	//bytecode 
    	codeFile.addProcedure(name);
    	CodeProcedure thisProc = new CodeProcedure(name, VoidType.TYPE, codeFile);
    	codeFile.updateProcedure(thisProc);
    	
    	for (int j = 0; j < children.size(); j++) {
    		children.get(j).belProc = thisProc;
    	}
    	if (param_list != null) {
    		for (int j = 0; j < param_list.size(); j++) {
    			param_list.get(j).belProc = thisProc;
    			param_list.get(j).genCode();
    		}
    	}
    	if (decl_list != null) {
    		for (int j = 0; j < decl_list.size(); j++) {
    			decl_list.get(j).belProc = thisProc;
    			decl_list.get(j).genCode();
    		}
    	}
    	if (stmt_list != null) {
    		for (int j = 0; j < stmt_list.size(); j++) {
    			stmt_list.get(j).belProc = thisProc;
    			stmt_list.get(j).genCode();
    		}
    	}
    	if (name.equals("Main")) {
    		codeFile.setMain("Main");
    	}
    }
    
    public String printAst(String prefix) {
        String ret = prefix + "(PROC_DECL " + (type2 != null ? type2.printAst("") : "") + "(NAME " + name + "))\n";
        for (int i = 0; i < children.size(); i++) {
        	ret += children.get(i).printAst(prefix + "\t");
        }
        return ret + prefix + ")\n";
    }
}
