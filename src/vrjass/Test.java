package vrjass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

import listener.ExpressionDefinitionPhase;
import listener.SymbolDefinitionPhase;
import listener.ValidationPhase;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("c:/users/ruke/workspace/vrjass/src/vrjass/test.j");
			BufferedReader reader = new BufferedReader(file);
			LinkedList<String> lines = new LinkedList<String>();
			String line;

			while ((line = reader.readLine()) != null) {
				lines.add(line.replace("\t", "    "));
			}

			file.close();
			reader.close();

			// create a CharStream that reads from standard input
			ANTLRInputStream input = new ANTLRInputStream(String.join("\n", lines).trim());

			// create a lexer that feeds off of input CharStream
			vrJASSLexer lexer = new vrJASSLexer(input);

			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			// create a parser that feeds off the tokens buffer
			vrJASSParser parser = new vrJASSParser(tokens);

			ParseTree tree = parser.init(); // begin parsing at init rule

			// Create a generic parse tree walker that can trigger callbacks
			ParseTreeWalker walker = new ParseTreeWalker();

			SymbolDefinitionPhase symbolPhase = new SymbolDefinitionPhase();
			walker.walk(symbolPhase, tree);

			ExpressionDefinitionPhase exprPhase = new ExpressionDefinitionPhase(symbolPhase);
			walker.walk(exprPhase, tree);

			ValidationPhase validationPhase = new ValidationPhase(symbolPhase.getElementContainer());
			walker.walk(validationPhase, tree);

			validationPhase.validateAll();

			System.out.println(validationPhase.getErrors().toString().replace(",", "\n"));
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
