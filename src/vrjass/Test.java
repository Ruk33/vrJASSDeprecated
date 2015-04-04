package vrjass;

import java.io.FileInputStream;
import java.io.InputStream;

import listener.DefPhase;
import listener.RefPhase;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import util.ErrorBag;

public class Test {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/users/ruke/workspace/vrjass/src/vrjass/test.j");
			
			// create a CharStream that reads from standard input
			ANTLRInputStream input = new ANTLRInputStream(is);
			
			// create a lexer that feeds off of input CharStream
			vrJASSLexer lexer = new vrJASSLexer(input);
			
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			// create a parser that feeds off the tokens buffer
			vrJASSParser parser = new vrJASSParser(tokens);
			
			ParseTree tree = parser.init(); // begin parsing at init rule
			
			// Create a generic parse tree walker that can trigger callbacks
			ParseTreeWalker walker = new ParseTreeWalker();
			
			DefPhase def = new DefPhase();
			
			// Walk the tree created during the parse, trigger callbacks
			walker.walk(def, tree);
			def.defineAllDependencies();
			
			ErrorBag errorBag = new ErrorBag();
			
			//walker.walk(new RefPhase(def.getParserTree(), errorBag), tree);
			
			//System.out.println(errorBag.getMessages());
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
