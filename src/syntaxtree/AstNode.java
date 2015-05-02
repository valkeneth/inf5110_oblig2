package syntaxtree;
import java.util.List;

abstract public class AstNode {
	
    List<AstNode> children;

    abstract public String printAst(String prefix);
}
