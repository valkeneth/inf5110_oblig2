package syntaxtree;
import bytecode.instructions.*;

public class ReturnStatement extends Statement{
	
	Expression exp;
	
    public ReturnStatement (Expression exp) {
    	super(null);
    	super.stmt = this;
    	this.exp = exp;
    	if (exp != null) exp.setParent(this);
    }

    public String printAst(String prefix) {
        String ret = prefix + "(RETURN_STMT\n";
        if (exp != null) ret += exp.printAst(prefix + "\t");
        ret += prefix + ")\n";
        return ret;
    }
    
    public void genCode() {
    	if (exp != null && belProc != null) {
    		if (exp.getExpType().equals("var")) {
    			if (exp.getChildren().get(0) instanceof Var) {
    				Var v = (Var) exp.getChildren().get(0);
    				belProc.addInstruction( new LOADLOCAL (belProc.variableNumber(v.getName())));
    			}
    			//
    		}
    		else {
    			
    		}

        	belProc.addInstruction(new RETURN());
        	codeFile.updateProcedure(belProc);
    	}
    }
    
    @Override
    public void checkParentSem() {
    	//System.out.println("Exp type :" + exp.getType());
    	//System.out.println("checking return parent..");
    	if (exp != null) {
			if (!parent.getType().equals(exp.getType())) {
				if ((parent.getType().equals("float") && exp.getType().equals("int")) || (parent.getType().equals("int") && exp.getType().equals("float"))) {
					
				}
				else {
					semErrors.add("Return type incompatible - expected : " + parent.parent.getType() + " - actual: " + exp.getType());
				}
			}
    	}
    	if (exp == null && parent.getType() != null) {
    		semErrors.add("Return type incompatible - expected : " + parent.parent.getType() + " - actual: null");
    	}
    }
}
