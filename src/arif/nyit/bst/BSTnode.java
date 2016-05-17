package arif.nyit.bst;

import arif.nyit.morse.Letter;

public class BSTnode {
	
	protected Letter info;
	protected BSTnode leftNode;
	protected BSTnode rightNode;
	
	public BSTnode(Letter info) {
		this.info = info;
		leftNode = null;
		rightNode = null;
	}

	public void setInfo(Letter info) {
		this.info = info;
	}

	public void setLeftNode(BSTnode leftNode) {
		this.leftNode = leftNode;
	}

	public void setRightNode(BSTnode rightNode) {
		this.rightNode = rightNode;
	}

	public Letter getInfo() {
		return info;
	}

	public BSTnode getLeftNode() {
		return leftNode;
	}

	public BSTnode getRightNode() {
		return rightNode;
	}
	
	
}
