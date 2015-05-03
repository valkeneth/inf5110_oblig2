package syntaxtree;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import bytecode.CodeFile;

public class Program {

    List<AstNode> nodes;
    String prefix = "\t";

    public Program(List<AstNode> nodes) {
        this.nodes = nodes;
        this.nodes.get(0).init();
        for (int i = 0; i < nodes.size(); i++) {
        	nodes.get(i).genCode();
        }
    }
    
    public CodeFile getCode() {
    	return nodes.get(0).codeFile;
    }
    
    public int checkSemantics() {
    	//System.out.println("Num semantic errors: " + nodes.get(0).getErrors().size());
    	//System.out.println("Num symbols: " + nodes.get(0).symbolTable.size());
    	if (nodes.get(0).getErrors().size() > 0) {
    		printSemanticErrors();
    		return 2;
    	}
    	return 0;
    }
    
    public void reset() {
    	nodes.get(0).resetSymbols();
    }
    
    public void printSemanticErrors() {
    	for (int i = 0; i < nodes.get(0).semErrors.size(); i++) {
			System.out.println("SemanticError " + (i + 1) + ":" + nodes.get(0).semErrors.get(i));
		}
    }

    public String printAst(){
        StringBuilder sb = new StringBuilder();
        sb.append("(PROGRAM\n");
        for (AstNode node : nodes) {
            sb.append(node.printAst(prefix));
        }
        sb.append(")\n");
        System.out.println(sb);
        return sb.toString();
    }
}
