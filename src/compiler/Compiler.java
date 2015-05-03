package compiler;

import java.io.*;

import bytecode.CodeFile;

import syntaxtree.*;
import oblig1NF.*;

public class Compiler {
    private String inFilename = null;
    private String astFilename = null;
    private String binFilename = null;
    public String syntaxError;
    public String error;
    public Compiler(String inFilename, String astFilename, String binFilename){
        this.inFilename = inFilename;
        this.astFilename = astFilename;
        this.binFilename = binFilename;
    }
    public int compile() throws Exception {
        InputStream inputStream = null;
        inputStream = new FileInputStream(this.inFilename);
        Lexer lexer = new Lexer(inputStream);
        parser parser = new parser(lexer);
        Program program;
        try {
            program = (Program)parser.parse().value;
        } catch (Exception e) {
            // Do something here?
            throw e; // Or something.
        }
        // Check semantics.
        int semanticCheck = program.checkSemantics();
        if(semanticCheck == 0){ // If it is all ok:
            writeAST(program);
            generateCode(program);
            program.reset();
            return 0;
        } else if (semanticCheck == 1){ // If there is a SYNTAX ERROR (Should not get that for the tests):
            System.out.println("syntax error");
            program.reset();
            return 1;
        } else { // If there is a SEMANTIC ERROR (Should get that for the test with "_fail" in the name):
        	program.reset();
        	return 2;
        }
    }
    private void writeAST(Program program) throws Exception {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.astFilename));
        //bufferedWriter.write(program.printAst());
        //bufferedWriter.close();
    	//System.out.println(program.printAst());
    }
    private void generateCode(Program program) throws Exception {
        CodeFile codeFile = new CodeFile();
        codeFile = program.getCode();
        byte[] bytecode = codeFile.getBytecode();
        DataOutputStream stream = new DataOutputStream(new FileOutputStream (this.binFilename));
        stream.write(bytecode);
        stream.close();
    }
    public static void main(String[] args) {
        Compiler compiler = new Compiler(args[0], args[1], args[2]);
        int result;
        try {
            result = compiler.compile();
            if(result == 1){
                System.out.println(compiler.syntaxError);
            } else if(result == 2){
                System.out.println(compiler.error);
            }
            System.exit(result);
        } catch (Exception e) {
            System.out.println("ERRORE: " + e);
            // If unknown error.
            System.exit(3);
        }
    }
    public static String indent(int indent){
        String result = "";
        for(int i=0;i<indent; i++){
            result+=" ";
        }
        return result;
    }
}
