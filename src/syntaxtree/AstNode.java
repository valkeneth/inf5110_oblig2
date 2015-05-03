package syntaxtree;
import java.util.*;

import bytecode.CodeFile;
import bytecode.CodeProcedure;
import bytecode.CodeStruct;

public class AstNode {
	
    List<AstNode> children;
    public String type = "";
    public static List<Symbol> symbolTable = new ArrayList<Symbol>();
    public static List<String> semErrors = new ArrayList<String>();
    public static AstNode parent = null;
    public String scope = "";
    public static CodeFile codeFile = new CodeFile();
    public CodeStruct belStruct = null;
    public CodeProcedure belProc = null;
    
    public void setParent(AstNode node) {
    	this.parent = node;
    }
    
    public void genCode() {
    	//
    }

    public AstNode getParent() {
    	return parent;
    }
    
    public void setScope(String scope) {
    	this.scope = scope;
    }
    
    public String getScope() {
    	return scope;
    }
    
    public String printAst(String prefix) {
    	return "";
    }
    
    public String getType() {
    	return this.type;
    }
    
    public void setType(String type) {
    	this.type = type;
    }
    
    public static void init() {
    	//symbolTable = new ArrayList<Symbol>();
    	//semErrors = new ArrayList<String>();
    	symbolTable.add(new Symbol("readint", "int", "method"));
    	Symbol sym = new Symbol("printint", "null", "method");
    	sym.setParams("int");
    	symbolTable.add(sym);
    }
    
    public static void resetSymbols() {
    	symbolTable = new ArrayList<Symbol>();
    	semErrors = new ArrayList<String>();
    	codeFile = new CodeFile();
    }
    
    public static List<String> getErrors() {
    	return semErrors;
    }
    
    public void checkParentSem() {
    	return;
    }
    
    public static void printSymbols() {
    	for (int i = 0; i < symbolTable.size(); i++) {
    		//System.out.println("symboltable: " + symbolTable.get(i).name + "=" + symbolTable.get(i).type); 
    	}
    }
}
