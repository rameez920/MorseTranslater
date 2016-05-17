package arif.nyit.bst;

import arif.nyit.morse.Letter;

public class BinarySearchTree {
	protected static BSTnode root;
	public static int pIndex = 0;

// Constructs a binary tree from a post order and in order array using recursion
	public static BSTnode generateTree(Letter[] inOrder, Letter[] preOrder, int startIndex, int endIndex) {
		if (startIndex > endIndex)
			return null;
		
		BSTnode root = new BSTnode(preOrder[pIndex]);
		pIndex++;
		
		if (startIndex == endIndex)
			return root;
		
		int index = getInOrderIndex(inOrder, startIndex, endIndex, root.info);
		root.setLeftNode(generateTree(inOrder,preOrder,startIndex, index - 1));
		root.setRightNode(generateTree(inOrder,preOrder,index + 1, endIndex));
		
		return root;
	}
	
	public static int getInOrderIndex(Letter[] inOrder, int start, int end, Letter data) {
		for(int i=start;i<=end;i++){
			if(inOrder[i]==data){
				return i;
			}
		}
		return -1;
	}
	
	
	
}
