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
		System.out.println("Hello");
		
		String filepath = "./example.fll";

		InputStream is;
		try {
			is = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		ANTLRInputStream input;
		try {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		/* Lexer */
		FreedomLessLessLexer lexer = new FreedomLessLessLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		/* Parser */
		FreedomLessLessParser parser = new FreedomLessLessParser(tokens);

		/* Parse Tree */
		ParseTree tree;
		
		try {
			tree = parser.program_def();
		} catch (RecognitionException e) {
			e.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		//! Show tree
//		showTree(parser, tree);
			
		FreedomLessLessCodeVisitor visitor = new FreedomLessLessCodeVisitor();
		
		String x = tree.accept(visitor);
		System.out.println(x);
		
		try {
			PrintWriter out = new PrintWriter("code.ll");
			out.write(x);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static void showTree(FreedomLessLessParser parser, ParseTree tree) {
		JFrame frame = new JFrame("Tree");
		TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
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
