package syntaxtree;

public class Symbol {
	
	public String name;
	public String type;
	public String params;
	public String mtype;
	
	public Symbol(String name, String type, String mtype) {
		this.name = name;
		this.type = type;
		this.mtype = mtype;
	}
	
}