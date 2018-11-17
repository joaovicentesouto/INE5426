import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		String filepath = "./example.fll";

		InputStream is;
		try {
			is = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		ANTLRInputStream input;
		try {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

		/* Lexer */
		FreedomLessLessLexer lexer = new FreedomLessLessLexer(input);
//		lexer.removeErrorListeners();
//		lexer.addErrorListener(new LexerError());
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		/* Parser */
		FreedomLessLessParser parser = new FreedomLessLessParser(tokens);
//		parser.setErrorHandler(new ErrorStrategy());

		/* Parse Tree */
		ParseTree tree;
		try {
			tree = parser.program_def();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} // begin parsing at program_def rule
		
		
		// System.out.println(tree.toStringTree(parser)); // print tree as text
		
		
//		treeGui(parser, tree);

		/* Semantic analysis */
//		ParseTreeWalker walker = new ParseTreeWalker();
//		AMZSemanticListener semanticListener = new AMZSemanticListener(filepath);
//		walker.walk(semanticListener, tree);
//		return semanticListener.getSymbolTable();
			
		FreedomLessLessCodeVisitor visitor = new FreedomLessLessCodeVisitor();
		
		String x = tree.accept(visitor);
		System.out.println(x);
		
		try {
			PrintWriter out = new PrintWriter("code.ll");
			out.write(x);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void treeGui(FreedomLessLessParser parser, ParseTree tree) {
		JFrame frame = new JFrame("Tree");
		TreeViewer viewr = new TreeViewer(
			Arrays.asList(parser.getRuleNames()), tree
		);
		viewr.setScale(1.5);
		JPanel panel = new JPanel();
		panel.add(viewr);
		JScrollPane jsp = new JScrollPane(panel);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(jsp);
		frame.setSize(5000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
