package syntaxtree;

public class Type extends AstNode{

    String name;
    
    public Type (String name) {
    	super();
    	this.name = name;
    }

    public String printAst(String prefix) {
        return "(TYPE " + name + ")";
    }
    
    public String getType() {
    	return name;
    }
    
    public String getName() {
    	return name;
    }
}
