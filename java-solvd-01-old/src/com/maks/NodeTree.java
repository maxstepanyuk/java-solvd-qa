package com.maks;

public class NodeTree {


	private Node rootNode;

	// constructors
	public NodeTree() {
		rootNode = null;
	}
//	public NodeTree(Integer inValue) {
//		rootNode = new Node(inValue);
//	}

	// insert -> rec method
	public void insertValue(Integer  inValue) {

		//moved to recursive method - and this fixed(i thougth so) my problem and i dont know why - thats not really good that i dont really know
//		if (rootNode == null) {
//			rootNode = new Node(inValue);
//		} else {
			rootNode = insertNode(rootNode, inValue);
//		}
	}

	/*Node insertRootNode(Integer  inValue) {

		// todo

	}*/

	// insert recursive
	// it doesnt work
	private Node insertNode(Node inRootNode, Integer  inValue) {
		String debugMessage = "inserting " + inValue + "; "; //idk enymore :((

		if (inRootNode == null) {
			inRootNode = new Node(inValue);
			debugMessage += "nulled";
			//return inRootNode;

		}
//		else
			if (inValue < inRootNode.getValue() ) {

				inRootNode.setLeft (
						insertNode(inRootNode.getLeft(), inValue)
				);

				//debugMessage = "inserted left : " + inRootNode.getValue();

			} else if (inValue > inRootNode.getValue() ) {
//			} else {

				inRootNode.setRight (
						insertNode(inRootNode.getRight(), inValue)
				);

				//debugMessage = "inserted right: " + inRootNode.getValue();

			}

		System.out.print( "* " + debugMessage + ".\n" );
 		return inRootNode;
	}

	// print tree
	public void printTree() {
		System.out.print( "tree : " );
		printNodeTree(rootNode);
		System.out.print( "end\n" );
	}

	private void printNodeTree(Node inRootNode) {

		if (inRootNode != null) {
			printNodeTree(inRootNode.getLeft());
			System.out.print(inRootNode.getValue() + "; ");
			printNodeTree(inRootNode.getRight() );
		}
	}

/*
            //return - todo
            public void returnTreeArr() {
                returnNodeTreeArr(rootNode);
            }

            // print tree from left to right
            private int[] returnNodeTreeArr(Node inRootNode, int[] inArr){

                if (inRootNode != null) {
                    returnNodeTreeArr(inRootNode.left);

                    //todo concatination...
                    int[] outArr = new int[inArr.length + 1];
                    for (int i = 0; i < inArr.length; i++){
                        outArr[i] = inArr[i];
                    }
                    outArr[outArr.length - 1] =

                            returnNodeTreeArr(inRootNode.right);
                } else {
                    return outArr;
                }
            }

	*/


	public int getMaxValue() {
		return getMaxNode( rootNode ).getValue();
	}
	private Node getMaxNode(Node inRootNode) {
		while (inRootNode.getRight() != null) {
			inRootNode = inRootNode.getRight();
		}
		return inRootNode;
	}


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