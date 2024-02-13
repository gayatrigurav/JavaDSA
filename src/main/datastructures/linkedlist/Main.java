package linkedlist;

import java.util.HashMap;

public class Main {

    //my new project
    public static void main(String[] args) {

        //map 1 and map2 pointing to same value here->"pointer"
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2;

        map1.put("value", 11);
        map2 = map1;

        System.out.println(map1);
        System.out.println(map2);

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(5);
        myLinkedList.prepend(1);
        myLinkedList.set(2,8);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.insert(0,9);
        myLinkedList.remove(0);


        LinkedList myLinkedList1 = new LinkedList(4);
        myLinkedList1.append(8);
        myLinkedList1.append(15);
        myLinkedList1.append(19);
        myLinkedList1.printList();

        LinkedList myLinkedList2 = new LinkedList(7);
        myLinkedList2.append(9);
        myLinkedList2.append(10);
        myLinkedList2.append(16);
        myLinkedList2.printList();


       // System.out.println(myLinkedList.removeLast().value);
       // System.out.println(myLinkedList.removeLast().value);
       // System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.get(1).value+ "\n");
        // myLinkedList.printList();


        //Doubly Linked List
        DoublyLinkedList myDDL = new DoublyLinkedList(1);
        myDDL.append(2);
        myDDL.prepend(7);
        myDDL.set(2,0);
        myDDL.insert(1,4);
        myDDL.remove(2);
        //System.out.println(myDDL.removeLast().value);
        System.out.println(myDDL.removeFirst().value);
        myDDL.printList();

    }

}