package AmazonInterviewQuestions;

public class IsBinarySearchTreeSolution2 {

    //Time complexity: O(N) where Nis the number of nodes in the tree
    //Auxiliary Space:O(1) if function call stack size is not considered, otherwise O(H)
    //where H is the height of tree
    //Check BST using specified range of minimum and maximum values of nodes.
    static class Node{
        int data;
        Node left,right;

        Node(int item){
            data= item;
            left = right = null;
        }
    }
    static boolean isBST(Node root){
        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    static boolean isBSTUtil(Node node, int min,int max){
        if(node == null){
            return true;
        }
        if(node.data < min || node.data >max){
            return false;
        }

        return (isBSTUtil(node.left,min, node.data-1) &&
                isBSTUtil(node.right,node.data+1 ,max));
    }

    public static void main(String[] args){
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);


        if(isBST(root)){
            System.out.println("Is BST");
        }else{
            System.out.println("Not the BST");
        }

    }
}
