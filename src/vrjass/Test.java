package vrjass;

import java.io.FileInputStream;

import symbol.*;

import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.sun.org.apache.bcel.internal.classfile.LocalVariable;

public class Test {

	public static void main(String[] args) {
		LimboSymbol limbo = new LimboSymbol();
		
		Symbol libraryA = new LibrarySymbol("A", limbo);
			Symbol classRuke = new ClassSymbol("Ruke", Visibility.PUBLIC, libraryA);
			
			Symbol libraryPerson = new LibrarySymbol("AbstractTime", limbo);
				Symbol classPerson = new ClassSymbol("Person", Visibility.PUBLIC, libraryPerson);
		
		limbo.getDependencyDefiner().add(libraryA, "AbstractTime", PrimitiveType.LIBRARY);
		limbo.getDependencyDefiner().add(classRuke, "Person", PrimitiveType.CLASS);
		limbo.getDependencyDefiner().defineAll();
		 
		System.out.println(limbo);
		
		/*
		try {
			InputStream is = new FileInputStream("c:/users/ruke/workspace/vrjass/src/ruke/test.j");
			
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
			
			RefPhase ref = new RefPhase(def.getGlobalScope(), def.getScopes());
			
			walker.walk(ref, tree);
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		*/
	}

}
