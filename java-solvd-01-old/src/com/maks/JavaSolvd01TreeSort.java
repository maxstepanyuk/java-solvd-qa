package com.maks;

public class JavaSolvd01TreeSort {
    public static void main(String[] args) {
        //consoleNewLine(4);

        int[] inArr = { -60, 10, 12, 11, 8, -3, 12, 9, 87 };
        printIntArr(inArr, "inArr");

        NodeTree tree1 = new NodeTree();

        // sorting - insert into a tree
        for (int i = 0; i < inArr.length; i++) {
            tree1.insertValue(inArr[i]);
        }

        tree1.printTree(); //(? insert into an array and) print

        System.out.print("max : " + tree1.getMaxValue() + "\n");
        System.out.print("min : " + tree1.getMinValue() + "\n");
    }



    // n new lines
    public static void consoleNewLine(int nLines) {
        for (int i = 0; i < nLines; i++) {
            System.out.print("\n");
        }
    }

    // print int array
    public static void printIntArr(int[] inArr, String inArrName) {
        System.out.print("inArr[" + inArr.length + "] : ");
        for (int i = 0; i < inArr.length; i++) {
            System.out.print(inArr[i] + "; ");
        }
        System.out.println();
    }
}
