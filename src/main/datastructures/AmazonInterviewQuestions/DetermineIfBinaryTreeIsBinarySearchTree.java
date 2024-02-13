package AmazonInterviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class DetermineIfBinaryTreeIsBinarySearchTree {

    //If inorder traversal of binary tree gives sorted ascending sequence then its binary search tree
   // Time Complexity: O(N), Where N is the number of nodes in the tree
   // Auxiliary Space: O(H), Here H is the height of the tree and the extra space is used due to the function call stack.
    static class Node{
        int data;
        Node left,right;

        Node(int item){
            data = item;
            left = right = null;
        }
    }
   static boolean checkBTS(Node root){
        List<Integer> inOrderList = new LinkedList<>();

        //Populate the list
        helper(root,inOrderList);

        boolean isBST = true;
        int prev = inOrderList.get(0);
        for(int i = 1; i< inOrderList.size();i++){
            //Check if new element is smaller than previous
            //or if the element is duplicate
            if(inOrderList.get(i) <= prev)
                isBST = false;

            prev = inOrderList.get(i);
        }
        return isBST;
    }

    static void helper(Node treeNode, List<Integer> inOrderList){
         if(treeNode == null) return;

         helper(treeNode.left, inOrderList);
         inOrderList.add(treeNode.data);
         helper(treeNode.right,inOrderList);
    }

    public static void main(String[] args){

      Node root = new Node(3);
      root.left = new Node(2);
      root.right = new Node(5);
      root.left.left = new Node(1);
      root.left.right = new Node(4);


      if(checkBTS(root))
          System.out.println("Is BST");
      else
          System.out.println("Not the BST");
    }
}
