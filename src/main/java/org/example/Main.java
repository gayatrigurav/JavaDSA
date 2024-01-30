package org.example;

import org.w3c.dom.Node;

import java.util.HashMap;

public class Main {

    //my new project
    public static void main(String[] args) {

        //map 1 and map2 pointing to same value here->"pointer"
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        System.out.println(map1);
        System.out.println(map2);

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(5);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());

        // myLinkedList.printList();

    }

}