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
    	boolean methodDeclared = false;
    	for (int i = 0; i < symbolTable.size(); i++) {
			if (symbolTable.get(i).name.equals(this.name) && symbolTable.get(i).mtype.equals("method")) {
				methodDeclared = true;
			}
    	}
    	if (name.equals("printstr") || name.equals("printint") || name.equals("printfloat") || name.equals("printline")) methodDeclared = true;
    	if (!methodDeclared) semErrors.add("Method with name " + name + " has not been declared");
    }
    
    public String getType() {
    	for (int i = 0; i < symbolTable.size(); i++) {
			if (symbolTable.get(i).name.equals(this.name) && symbolTable.get(i).mtype.equals("method")) {
				return symbolTable.get(i).type;
			}
    	}
    	return "";
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
    
    @Override
    public void checkParentSem() {
    	return;
    }
}
