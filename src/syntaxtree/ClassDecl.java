package syntaxtree;
import java.util.List;

public class ClassDecl extends AstNode{

    String name;
    
    public ClassDecl (String name) {
    	super();
        this.name = name;
    }
    
    public ClassDecl (String name, List<AstNode> children) {
    	super();
        this.name = name;
        this.children = children;
        Symbol sym = new Symbol(name, name, "class");
    	symbolTable.add(sym);
    }

    public String printAst(String prefix) {
    	String ret = prefix + "(CLASS_DECL(NAME " + name + ")\n";
    	for (int i = 0; i < children.size(); i++) {
    		ret += children.get(i).printAst(prefix + "\t");
    	}
    	ret += prefix + ")\n";
    	return ret;
    }
}
