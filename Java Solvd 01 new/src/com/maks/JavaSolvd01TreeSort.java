package com.maks;

public class JavaSolvd01TreeSort {
    public static void main(String[] args) {

        int[] inArr = {  10, 12, 11, 8, -3, 12, 9, 87, -60, };
        printIntArr(inArr, "inArr");

//        NodeTree tree1 = new NodeTree(inArr[0]);
//
//        // sorting - insert into a tree
//        for (int i = 0; i < inArr.length; i++) {
//            tree1.insertNextNode(tree1.getRootNode(), inArr[i]);
////            tree1.insertNextNode(tree1.getRootNode(), inArr[i]);
//        }

        NodeTree tree1 = new NodeTree();

        // sorting - insert into a tree
        for (int i = 0; i < inArr.length; i++) {
            tree1.insertValue(inArr[i]);
        }

        tree1.printTree(); //(? insert into an array and) print

        System.out.print("max : " + tree1.getMaxValue() + "\n");
        System.out.print("min : " + tree1.getMinValue() + "\n");
    }

    // print int array
    public static void printIntArr(int[] inArr, String inArrName) {
        System.out.print(inArrName + ": ");
        for (int i = 0; i < inArr.length; i++) {
            System.out.print(inArr[i] + "; ");
        }
        System.out.println();
    }
}
