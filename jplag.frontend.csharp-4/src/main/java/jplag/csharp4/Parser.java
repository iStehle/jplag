package jplag.csharp4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import jplag.StrippedProgram;
import jplag.Structure;
import jplag.UnicodeReader;
import jplag.csharp4.grammar.CSharp4Lexer;
import jplag.csharp4.grammar.CSharp4Listener;
import jplag.csharp4.grammar.CSharp4Parser;
import jplag.csharp4.grammar.CSharp4Parser.Compilation_unitContext;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Parser extends jplag.Parser implements CSharpTokenConstants {
	private Structure struct;
	private String currentFile;

	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("Only one parameter allowed.");
			System.exit(-1);
		}
		Parser parser = new Parser();
		parser.setProgram(new StrippedProgram());
		jplag.Structure struct = parser.parse(new File(args[0]).getParentFile(), new String[] { new File(args[0]).getName() });
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
			int lineNr = 1;
			int token = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				if (token < struct.size()) {
					boolean first = true;
					while (struct.tokens[token] != null && struct.tokens[token].getLine() == lineNr) {
						if (!first)
							System.out.println();
						CSharpToken tok = (CSharpToken) struct.tokens[token];
						System.out.print(CSharpToken.type2string(tok.type) + " (" + tok.getLine() + "," + tok.getColumn() + ","
								+ tok.getLength() + ")\t");
						first = false;
						token++;
					}
					if (first)
						System.out.print(" \t");
				} else
					System.out.print(" \t");
				System.out.println(line);
				lineNr++;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public jplag.Structure parse(File dir, String files[]) {
		struct = new Structure();
		errors = 0;
		for (int i = 0; i < files.length; i++) {
						getProgram().print(null, "Parsing file " + files[i] + "\n");
			if (!parseFile(dir, files[i]))
				errors++;
			struct.addToken(new CSharpToken(FILE_END, files[i], -1, -1, -1));
		}
		this.parseEnd();
		return struct;
	}

	private boolean parseFile(File dir, String file) {
		try {
			FileInputStream fis = new FileInputStream(new File(dir, file));
                        ANTLRInputStream input;
			currentFile = file;
                        input = new ANTLRInputStream(fis);
			// Create a scanner that reads from the input stream passed to us
			CSharp4Lexer lexer = new CSharp4Lexer(input);
                        
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
			

			// Create a parser that reads from the scanner
			CSharp4Parser parser = new CSharp4Parser(tokens);
			Compilation_unitContext cuc = parser.compilation_unit();
			

			ParseTreeWalker ptw = new ParseTreeWalker();
			for (int i = 0; i < cuc.getChildCount(); i++) {
				ParseTree pt = cuc.getChild(i);
				ptw.walk(new JplagCSharp4Listener(this), pt);
			}
		} catch (Exception e) {
			getProgram().addError("  Parsing Error in '" + file + "':\n  " + e.toString() + "\n");
			return false;
		}
		return true;
	}

	public void add(int type, antlr.Token tok) {
		if (tok == null) {
			System.out.println("tok == null  ERROR!");
			return;
		}
		struct.addToken(new CSharpToken(type, currentFile, tok.getLine(), tok.getColumn(), tok.getText().length()));
		     System.out.println("type: " + CSharpToken.type2string(type) +
		 		       " text: '"+tok.getText()+"'");
	}

	//public void add(int type, CSharpParser p) {
	//	add(type, p.getLastConsumedToken());
	//}
        public void add(int type, org.antlr.v4.runtime.Token tok) {
		struct.addToken(new CSharpToken(type, (currentFile == null ? "null" : currentFile), tok.getLine(), tok.getStartIndex(), 
				tok.getText().length()));
	}
}
