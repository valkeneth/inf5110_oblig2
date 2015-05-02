package syntaxtree;

public class Param extends AstNode{

    String name;
    Type type;
    boolean ref;
    
    public Param (String name, Type type, boolean ref) {
    	super();
    	this.name = name;
    	this.type = type;
    	this.ref = ref;
    	Symbol sym = new Symbol(name, type.getName(), "variable");
    	symbolTable.add(sym);
    }

    public String printAst(String prefix) {
        return prefix + "(PARAM_DECL " + (ref ? "ref" : "") + type.printAst("") + "(NAME " + name + "))\n";
    }
}
