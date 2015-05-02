package syntaxtree;
import java.util.List;
import java.util.LinkedList;

public class ProcDecl extends AstNode{

    String name;
    Type type;
    List<AstNode> children = new LinkedList();
    
    public ProcDecl (String name, Type type, List<AstNode> param_list, List<AstNode> decl_list, List<AstNode> stmt_list) {
    	super();
    	this.name = name;
    	this.type = type;
    	if (param_list != null) this.children.addAll(param_list);
    	if (decl_list != null) this.children.addAll(decl_list);
    	if (stmt_list != null) this.children.addAll(stmt_list);
    }

    public String printAst(String prefix) {
        String ret = prefix + "(PROC_DECL " + (type != null ? type.printAst("") : "") + "(NAME " + name + "))\n";
        for (int i = 0; i < children.size(); i++) {
        	ret += children.get(i).printAst(prefix + "\t");
        }
        return ret + prefix + ")\n";
    }
}
