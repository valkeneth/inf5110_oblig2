package syntaxtree;
import java.util.List;
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
