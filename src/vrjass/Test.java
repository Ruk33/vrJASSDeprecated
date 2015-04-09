package vrjass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

import listener.StatementExpressionDefinitionPhase;
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

			// Dark magic begins
			ANTLRInputStream input = new ANTLRInputStream(String.join("\n", lines).trim());
			vrJASSLexer lexer = new vrJASSLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			vrJASSParser parser = new vrJASSParser(tokens);

			ParseTree tree = parser.init(); // begin parsing at init rule

			ParseTreeWalker walker = new ParseTreeWalker();

			SymbolDefinitionPhase symbolPhase = new SymbolDefinitionPhase();
			walker.walk(symbolPhase, tree);

			StatementExpressionDefinitionPhase statExprPhase = new StatementExpressionDefinitionPhase(symbolPhase);
			walker.walk(statExprPhase, tree);

			ValidationPhase validationPhase = new ValidationPhase(symbolPhase.getElementContainer());
			walker.walk(validationPhase, tree);

			if (validationPhase.validateAll()) {
				// order functions depending on calls
				// print translated jass code
			} else {
				System.out.println(validationPhase.getErrors().toString().replace(",", "\n"));
			}
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
