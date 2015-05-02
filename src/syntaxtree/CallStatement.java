package syntaxtree;
import java.util.List;

public class CallStatement extends Statement{
	
	String name;
	List<AstNode> children;
	
    public CallStatement (String name, List<AstNode> children) {
    	super(null);
    	super.stmt = this;
    	this.name = name;
    	this.children = children;
    }

    public String printAst(String prefix) {
        String ret = prefix + "(CALL_STMT (NAME " + name + "\n";
        if (children != null) {
	        for (int i = 0; i < children.size(); i++) {
	        	ret += children.get(i).printAst(prefix + "\t");
	        }
        }
        ret += prefix + ")\n";
        return ret;
    }
}
