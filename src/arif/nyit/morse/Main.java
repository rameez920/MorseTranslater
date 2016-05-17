package arif.nyit.morse;

import java.util.Scanner;

import arif.nyit.bst.BSTnode;
import arif.nyit.bst.BinarySearchTree;



public class Main {

	public static void main(String[] args) {
		BSTnode root = fillTree();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word or sentence in morse code, use * for dots and - for dashes and use _ for spaces");
		
		String input = kb.nextLine().replace("#", "");
		String result = translate(root, input);
		System.out.println("Translation: " + result);
		
		

	}
	
	//splits a string into each morse letter and 
	//translates each letter into a new translated string
	private static String translate(BSTnode root, String morse_word) {
		String[] morse_letters = morse_word.split("_");
		char[] translatedLetters = new char[morse_letters.length];
		
		for (int i =0; i<morse_letters.length; i++) {
			translatedLetters[i] = getLetter(root, morse_letters[i]); 
		}
		
		return new String(translatedLetters);
	}
	
	//translates a morse letter into char by traversing through the binary tree
	private static char getLetter(BSTnode root, String morse_letter) {
		char[] signals = morse_letter.toCharArray();
		BSTnode current = root;
		
		for (int i = 0; i < signals.length; i++) {
		
			if (signals[i] == '*')
				current = current.getLeftNode();
			else
				current = current.getRightNode();
		}
		return current.getInfo().getLetter();
	}
	
	
	// fills a binary tree with data on morse code
	private static BSTnode fillTree() {
			Letter a = new Letter('a', "*-".toCharArray());
			Letter b = new Letter('b', "-***".toCharArray());
			Letter c = new Letter('c', "-*-*".toCharArray());
			Letter d = new Letter('d', "-**".toCharArray());
			Letter e = new Letter('e', "*".toCharArray());
			Letter f = new Letter('f', "**-".toCharArray());
			Letter g = new Letter('g', "--*".toCharArray());
			Letter h = new Letter('h', "****".toCharArray());
			Letter i = new Letter('i', "**".toCharArray());
			Letter j = new Letter('j', "*---".toCharArray());
			Letter k = new Letter('k', "-*-".toCharArray());
			Letter l = new Letter('l',"*-**".toCharArray());
			Letter m = new Letter('m', "--".toCharArray());
			Letter n = new Letter('n', "-*".toCharArray());
			Letter o = new Letter('o', "---".toCharArray());
			Letter p = new Letter('p', "*--*".toCharArray());
			Letter q = new Letter('q', "--*-".toCharArray());
			Letter r = new Letter('r', "*-*".toCharArray());
			Letter s = new Letter('s', "***".toCharArray());
			Letter t = new Letter('t', "-".toCharArray());
			Letter u = new Letter('u', "**-".toCharArray());
			Letter v = new Letter('v', "***-".toCharArray());
			Letter w = new Letter('w', "*--".toCharArray());
			Letter x = new Letter('x', "-**-".toCharArray());
			Letter y = new Letter('y', "-*--".toCharArray());
			Letter z = new Letter('z', "--**".toCharArray());
			Letter root = new Letter(' ', "null".toCharArray());
			
			Letter[] inOrderLetters = {h,s,v,i,f,u,e,l,r,a,p,w,j,root,b,d,x,n,c,k,y,t,z,g,q,m,o};
			Letter[] preOrderLetters = {root,e,i,s,h,v,u,f,a,r,l,w,p,j,t,n,d,b,x,k,c,y,m,g,z,q,o};
		
		
			
		
		return BinarySearchTree.generateTree(inOrderLetters, preOrderLetters, 0, inOrderLetters.length - 1);
	}
	

	

	
	
	

}
