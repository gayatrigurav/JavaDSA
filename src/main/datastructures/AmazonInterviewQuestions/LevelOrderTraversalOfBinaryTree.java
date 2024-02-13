package AmazonInterviewQuestions;

public class LevelOrderTraversalOfBinaryTree {
    //Given the root of binary tree, display the node values at each level.
    //Node values for all levels should be displayed on seperate lines.

    //Level order traversal technique is defined as a method to traverse a tree such
    //that all nodes present in the same level are traversed completely before traversing the next level.

    //Naive approach -> Find height of tree. Then for each level,run a recursive function
    //by maintaining current height.Whenever the level of a node matches,print the node.

    //Time Complexity:O(N2),where N is the number of nodes in the skewed tree.
    //Auxiliary Space: O(1) If the recursion stack is considered the space is O(N).
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        //root of the binary tree
        Node root;

        public BinaryTree() {
            root = null;
        }

        //function to print level order traversal of tree
        void printLevelOrder() {
            int h = height(root);
            int i;
            for (i = 1; i <= h; i++) {
                printCurrentLevel(root, i);
            }
        }

            // Compute the "height" of a tree -- the number of
            // nodes along the longest path from the root node
            // down to the farthest leaf node.
            int height (Node root)
            {
                if (root == null)
                    return 0;
                else {

                    // Compute  height of each subtree
                    int lheight = height(root.left);
                    int rheight = height(root.right);

                    // use the larger one
                    if (lheight > rheight)
                        return (lheight + 1);
                    else
                        return (rheight + 1);
                }
            }


            //print nodes at the current level
            void printCurrentLevel(Node root, int level){
                if(root == null){
                    return;
                }
                if(level == 1){
                    System.out.println(root.data);
                }
                else if (level > 1){
                    printCurrentLevel(root.left,level-1);
                    printCurrentLevel(root.right,level-1);
                }

            }

            //Driver program to test above function
           public static void main(String[] args){
               BinaryTree tree = new BinaryTree();
               tree.root = new Node(6);
               tree.root.left = new Node(2);
               tree.root.right = new Node(7);
               tree.root.left.left = new Node(4);
               tree.root.left.right = new Node(5);

               System.out.println("Level order traversal of " + "binary tree is ");
               tree.printLevelOrder();
           }

        }

    }

