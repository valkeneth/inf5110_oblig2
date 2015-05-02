package syntaxtree;

public class VarDecl extends AstNode{

    String name;
    Type type;
    
    public VarDecl (String name, Type type) {
    	super();
    	this.name = name;
    	this.type = type;
    }

    @Override
    public String printAst(String prefix) {
        return prefix + "(VAR_DECL " + type.printAst("") + "(NAME " + name + "))\n";
    }
}
