package syntaxtree;
import java.util.List;
import bytecode.instructions.*;

public class Expression extends AstNode{

    String name;
    List<AstNode> children;
    
    public Expression (String type, List<AstNode> children) {
    	super();
    	this.type = type;
    	this.children = children;
    	if (type.equals("new")) {
    		String xtype = children.get(0).getType();
    		boolean newTypeFound = false;
    		for (int i = 0; i < symbolTable.size(); i++) {
    			if (symbolTable.get(i).name.equals(xtype)) {
    				newTypeFound = true;
    			}
    		}
    		if (!newTypeFound) semErrors.add("new keyword - object of type " + xtype + " not declared");
    	}
    }
    
    public String getName() {
    	return name;
    }
    
    public String getExpType() {
    	return this.type;
    }
    
    public List<AstNode> getChildren() {
    	return children;
    }
    
    public String getType() {
    	if (children.size() == 1) {
    		return children.get(0).getType();
    	}
    	if (children.size() == 3) {
    		System.out.println("3 children: " + children.get(0).getType() + "," + children.get(1).getType() + "," 
    				+ children.get(2).getType());
    		if (children.get(2).getType().equals(children.get(1).getType()) && children.get(0).getType().equals("RelOp")) {
    			return "bool";
    		}
    		else if (children.get(0).getType().equals("AritOp")) {
    			if (children.get(2).getType().equals(children.get(1).getType())) {
    				return children.get(2).getType();
    			}
    			else if ((children.get(0).getType().equals("float") || children.get(0).getType().equals("int")) && (children.get(1).getType().equals("float") || children.get(1).getType().equals("int"))) {
    				return "float";
    			}
    		}
    		else {
    			semErrors.add("Incompatible operands for expression of type " + type);
    		}
    	}
    	return "";
    }

    public void genCode() {
    	if (belProc != null) {
	    	switch (this.type) {
	    		case "AritOp":
	    			if (children.get(0) instanceof AritOp) {
	    				AritOp a = (AritOp) children.get(0);
	    				String op = a.getOp();
	    				if (op.equals("+")) {
	    					children.get(1).belProc = belProc;
	    					children.get(1).genCode();
	    					children.get(2).belProc = belProc;
	    					children.get(2).genCode();
	    					belProc.addInstruction(new ADD());
	    				}
	    			}
	    		case "var":
	    			children.get(0).belProc = belProc;
					children.get(0).genCode();
	    	}
    	}
    }
    
    public String printAst(String prefix) {
    	switch (this.type) {
    		case "literal":
    			return prefix + "(" + children.get(0).printAst("") + ")\n";
    		case "new":
    			return prefix + "(NEW " + children.get(0).printAst("") + ")\n";
    		case "var":
    			return children.get(0).printAst(prefix);
    		case "rel":
    			String ret = prefix + children.get(0).printAst("") + "\n";
    			if (children.get(1) != null) {
    				ret += children.get(1).printAst(prefix + "\t");
    			}
    			if (children.get(2) != null) {
    				ret += children.get(2).printAst(prefix + "\t");
    			}
    			ret += prefix + ")\n";
    			return ret;
    		case "AritOp":
    			ret = prefix + children.get(0).printAst("") + "\n";
    			if (children.get(1) != null) {
    				ret += children.get(1).printAst(prefix + "\t");
    			}
    			if (children.get(2) != null) {
    				ret += children.get(2).printAst(prefix + "\t");
    			}
    			ret += prefix + ")\n";
    			return ret;
    		default:
    			return prefix + "(DEFAULTEXPR)\n";
    	}
    }
}
