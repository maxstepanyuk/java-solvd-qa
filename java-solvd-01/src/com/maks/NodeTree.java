package com.maks;

public class NodeTree {


	private Node rootNode;

	// constructor - empty
	public NodeTree() {}

	// constructor - set root
	public NodeTree(int inValue) {
		rootNode = new Node(inValue);
	}

	public  Node getRootNode() {
		return rootNode;
	}

	//methods
	public void insertValue(Integer  inValue) {
		rootNode = insertNextNode(this.rootNode, inValue);
	}

	private Node insertNextNode(Node inRootNode, Integer  inValue) {

		if (inRootNode == null) {
			return new Node(inValue);
		}

		if (inValue < inRootNode.getValue()) {
			inRootNode.setLeft(  insertNextNode(  inRootNode.getLeft(), inValue  )  );
		}		else if (inValue >= inRootNode.getValue())		{
			inRootNode.setRight(insertNextNode(inRootNode.getRight(), inValue));
		}
		return inRootNode;
	}

	// print tree
	public void printTree() {
		System.out.print( "tree : " );
		printNodeTree(rootNode);
		System.out.print( ".\n" );
	}

	private void printNodeTree(Node inRootNode) {
		if (inRootNode != null) {
			printNodeTree(inRootNode.getLeft());
			System.out.print(inRootNode.getValue() + "; ");
			printNodeTree(inRootNode.getRight() );
		}
	}

	//max
	public int getMaxValue() {
		return getMaxNode( rootNode ).getValue();
	}

	private Node getMaxNode(Node inRootNode) {
		while (inRootNode.getRight() != null) {
			inRootNode = inRootNode.getRight();
		}
		return inRootNode;
	}

//min
	public int getMinValue() {
		return getMinNode( rootNode ).getValue();
	}

	private Node getMinNode(Node inRootNode) {
		while (inRootNode.getLeft() != null) {
			inRootNode = inRootNode.getLeft();
		}
		return inRootNode;
	}
}