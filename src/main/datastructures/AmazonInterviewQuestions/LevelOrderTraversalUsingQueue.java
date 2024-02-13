package AmazonInterviewQuestions;



import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingQueue {

    //In level order traversal or you can say breadth first search(BFS)
    //we visit every node on a level before to a lower level.

    //Time complexity:O(N) where N is the number of nodes in the binary tree.
    //Auxiliary Space: O(N) where N is the number of nodes in the binary tree.

    static class Node{
        int data;
        Node left,right;

        public Node(int item){
            data = item;
            left=null;
            right=null;
        }
    }

    //class to print level order traversal
    static class BinaryTree{
        Node root;

        //Given a binary tree.Print its nodes in level order
        //using array for implementing queue
        void printLevelOrder(){
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            while(!queue.isEmpty()){
                //poll() removes the present head.
                Node tempNode = queue.poll();
                System.out.println(tempNode.data + " ");

                //Enqueue left child
                if(tempNode.left != null){
                    queue.add(tempNode.left);
                }

                //Enqueue right child
                if(tempNode.right != null){
                    queue.add(tempNode.right);
                }
            }
        }

        public static void main(String[] args){
            //creating binary tree and entering the nodes
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            System.out.println("Level order traversal of binary tree is -");
            tree.printLevelOrder();
        }
    }
}
