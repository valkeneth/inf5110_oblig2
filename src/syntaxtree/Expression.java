package syntaxtree;
import java.util.List;


public class Expression extends AstNode{

    String type;
    String name;
    List<AstNode> children;
    
    public Expression (String type, List<AstNode> children) {
    	super();
    	this.type = type;
    	this.children = children;
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
    		case "arit":
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
