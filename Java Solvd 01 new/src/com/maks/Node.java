package com.maks;

// node of binary search tree
public class Node {

	// fields
	private int value;
	private Node left;
	private Node right;
//	 Integer value;
//	 Node left;
//	 Node right;

	//get srt
	Integer  getValue(){ return this.value; }
	void setValue(Integer  inValue){ this.value = inValue; };

	Node getLeft(){ return this.left; }
	void setLeft(Node inLeft){ this.left = inLeft; };

	Node getRight(){ return this.right; }
//	void setRight(Node inRight){ this.left = inRight; }; //THE PROBLEM!!!
	void setRight(Node inRight){ this.right = inRight; };

	// constructors
	public Node() {}

	public Node(Integer  inValue) {
		value = inValue;
		left = null;
		right = null;
	}



}