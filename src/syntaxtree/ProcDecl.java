package syntaxtree;
import java.util.List;
import java.util.LinkedList;

public class ProcDecl extends AstNode{

    String name;
    Type type2;
    List<AstNode> children = new LinkedList();
    
    public ProcDecl (String name, Type type, List<AstNode> param_list, List<AstNode> decl_list, List<AstNode> stmt_list) {
    	super();
    	this.name = name;
    	this.type2 = type;
    	if (param_list != null) this.children.addAll(param_list);
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
            	Symbol sym = new Symbol(name, tname, "method");
            	symbolTable.add(sym);
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
    		Symbol sym = new Symbol(name, "", "method");
        	symbolTable.add(sym);
    	}
    	for (int j = 0; j < children.size(); j++) {
    		children.get(j).setParent(this);
    		children.get(j).checkParentSem();
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
