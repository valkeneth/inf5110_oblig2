package syntaxtree;

public class Literal extends AstNode{

    String name;
    Object obj;
    
    public Literal (String name, Object obj) {
    	super();
    	this.name = name;
    	this.obj = obj;
    }

    public String printAst(String prefix) {
        return name + "_LITERAL " + obj.toString();
    }
}
