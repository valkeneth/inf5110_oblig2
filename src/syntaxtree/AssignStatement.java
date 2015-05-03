package syntaxtree;

public class AssignStatement extends Statement{
	
	Var var;
	Expression exp;
	
    public AssignStatement (Var var, Expression exp) {
    	super(null);
    	super.stmt = this;
    	this.var = var;
    	this.exp = exp;
    	String varType = this.var.getType();
    	String expType = this.exp.getType();
    	if (varType.equals("")) {
    		for (int i = 0; i < symbolTable.size(); i++) {
    			if (symbolTable.get(i).name.equals(var.getName()) && symbolTable.get(i).mtype.equals("variable")) {
    				varType = symbolTable.get(i).type;
    				System.out.println(varType);
    			}
    		}
    	}
    		//varType = symbolTable.get(var.getName());
    	if (varType.equals(expType) != true) {
    		if (varType.equals("float") && expType.equals("int")) {
    			//alright
    		}
    		else {
        		semErrors.add("Trying to assign a type " + expType + " into " + this.var.getName() + ":" + varType);
    		}
    	}
    }

    public String printAst(String prefix) {
        String ret = prefix + "(ASSIGN_STMT\n";
        ret += var.printAst(prefix + "\t");
        ret += exp.printAst(prefix + "\t");
        ret += prefix + ")\n";
        return ret;
    }
    
    @Override
    public void checkParentSem() {
    	return;
    }
}
