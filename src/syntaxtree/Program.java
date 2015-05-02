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
    }
    
    public void generateCode(CodeFile codefile) {
    	//
    }
    
    public int checkSemantics() {
    	//System.out.println("Num semantic errors: " + nodes.get(0).getErrors().size());
    	//System.out.println("Num symbols: " + nodes.get(0).symbolTable.size());
    	if (nodes.get(0).getErrors().size() > 0) {
    		printSemanticErrors();
    		nodes.get(0).resetSymbols();
    		return 2;
    	}
    	nodes.get(0).resetSymbols();
    	return 0;
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
