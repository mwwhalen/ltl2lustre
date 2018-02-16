package ltl2lustre;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import jkind.lustre.Expr;
import ltl2lustre.parsing.StdErrErrorListener;
import ltl2lustre.parsing.ltlLexer;
import ltl2lustre.parsing.ltlParser;
import ltl2lustre.parsing.ltlParser.Ltl_specContext;
import ltl2lustre.parsing.ltlParser.NamedLtlExprContext;
import ltl2lustre.parsing.ltlParser.ProgramContext;
import ltl2lustre.visitors.DepthCheckVisitor;
import ltl2lustre.visitors.GenerateLustreVisitor;
import ltl2lustre.visitors.SafetyCheckVisitor;

public class LTL2Lustre {
	public static final String VERSION = "0.1";

	private static String propertyName(Ltl_specContext ctxt) {
		if (ctxt instanceof NamedLtlExprContext) {
			return ((NamedLtlExprContext)ctxt).name.getText();
		} else {
			return "Anonymous";
		}
	}

	public static void main(String[] args) {
		try {
			LTL2LustreSettings settings = LTL2LustreArgumentParser.parse(args);
			ProgramContext program = parseLtl(settings.filename);
			
			int count = 0; 
			for (Ltl_specContext ltlSpec: program.ltl_spec()) {
				try {
					System.out.println("Translating property #: " + count + 
							" [" + propertyName(ltlSpec) + "] "); 
					SafetyCheckVisitor scv = new SafetyCheckVisitor(settings.allowGUnderNegation);
					boolean isSafety = ltlSpec.accept(scv);
					if (!isSafety) {
						throw new Exception("property is not a safety property.");
					}
					
					DepthCheckVisitor dcv = new DepthCheckVisitor();
					int maxDepth = ltlSpec.accept(dcv);
					
					GenerateLustreVisitor glv = new GenerateLustreVisitor(maxDepth);
					Expr lustreExpr = ltlSpec.accept(glv);
					
					System.out.println(lustreExpr.toString());

				} catch(Exception e) {
					StdErr.error("Error translating property #: " + count + 
								" [" + propertyName(ltlSpec) + "]" + e.toString());
				}
				count++;
			}
		} catch (Throwable t) {
			t.printStackTrace();
			System.exit(ExitCodes.UNCAUGHT_EXCEPTION);
		}
	}

	public static ProgramContext parseLtl(String filename) throws Exception {
		File file = new File(filename);
		if (!file.exists() || !file.isFile()) {
			StdErr.fatal(ExitCodes.FILE_NOT_FOUND, "cannot find file " + filename);
		}
		if (!file.canRead()) {
			StdErr.fatal(ExitCodes.FILE_NOT_READABLE, "cannot read file " + filename);
		}

		StdErr.setLocationReference(readAllLines(filename));
		return parseLtl(new ANTLRFileStream(filename));
	}

	private static List<String> readAllLines(String filename) {
		Path path = FileSystems.getDefault().getPath(filename);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			return Collections.emptyList();
		}
	}

	public static ProgramContext parseLtl(CharStream stream) throws Exception {
		ltlLexer lexer = new ltlLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ltlParser parser = new ltlParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(new StdErrErrorListener());
		ProgramContext program = parser.program();

		if (parser.getNumberOfSyntaxErrors() > 0) {
			System.exit(ExitCodes.PARSE_ERROR);
		}

		return program;
	}
	
}
