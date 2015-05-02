package syntaxtree;
import java.util.*;

public class AstNode {
	
    List<AstNode> children;
    public String type = "";
    public static List<Symbol> symbolTable = new ArrayList<Symbol>();
    public static List<String> semErrors = new ArrayList<String>();
    public static AstNode parent = null;
    
    public void setParent(AstNode node) {
    	this.parent = node;
    }

    public AstNode getParent() {
    	return parent;
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
    
    public static void resetSymbols() {
    	symbolTable = new ArrayList<Symbol>();
    	semErrors = new ArrayList<String>();
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
