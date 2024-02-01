package binarySearchTree;

public class Main {

    public static void main(String[] args){
        BTS myBts = new BTS();
        myBts.insert(47);
        myBts.insert(21);
        myBts.insert(76);
        myBts.insert(18);
        myBts.insert(52);
        myBts.insert(82);

        myBts.insert(27);
        System.out.println(myBts.root.left.right.value);

        System.out.println(myBts.contains(27));
        System.out.println(myBts.contains(17));

        //System.out.println("root = " + myBts.root);
    }
}
