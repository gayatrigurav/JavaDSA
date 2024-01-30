package org.example;

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

       // System.out.println(myLinkedList.removeLast().value);
       // System.out.println(myLinkedList.removeLast().value);
       // System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.get(1).value+ "\n");

        // myLinkedList.printList();

    }

}