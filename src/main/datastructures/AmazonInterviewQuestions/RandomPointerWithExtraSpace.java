package AmazonInterviewQuestions;

import java.util.HashMap;

public class RandomPointerWithExtraSpace {

    //we have to make the deep copy of the given linkedlist
    //using extra space we can solve this
    //by using hasmap we can do mapping for old nodes to new nodes
    //a->a' ,b->b' ,c->c', d->d'
    //m[a] -> a', m[b]-> b',m[c]->c',m[d]-> d'
    //b->random= d
    //hence m[b]-> random = m[d]

    static class Node{
        int val;
        Node next;
        Node arbit;

        Node(int x){
            this.val = x;
            this.next = null;
            this.arbit = null;
        }
    }

    static class GFG {
        Node cloneLinkedList(Node head) {

            //Map to store the mapping of old nodes with new ones
            HashMap<Node, Node> mp = new HashMap<>();
            Node temp,
                    nhead;


            //Duplicate of the first node
            temp = head;
            nhead = new Node(temp.val);
            mp.put(temp, nhead);

            //loop to create duplicates of nodes with only next pointer
            while (temp.next != null) {
                nhead.next = new Node(temp.next.val);
                temp = temp.next;
                nhead = nhead.next;
                mp.put(temp, nhead);
            }
            temp = head;

            //Loop to clone the arbit pointer
            while (temp != null) {
                mp.get(temp).arbit = mp.get(temp.arbit);
                temp = temp.next;
            }
            //return the head of the clone
            return mp.get(head);
        }
    }

        static void printList(Node head) {
            System.out.println(head.val + "(" + head.arbit.val + ")");
            head = head.next;
            while (head != null) {
                System.out.println("->" + head.val + "(" + head.arbit.val + ")");
                head = head.next;
            }
            System.out.println();
        }


             public static void main(String[] args){
               Node head = new Node(1);
               head.next = new Node(2);
               head.next.next = new Node(3);
               head.next.next.next = new Node(4);
               head.next.next.next.next = new Node(5);
               head.arbit = head.next.next;
               head.next.arbit = head;
               head.next.next.arbit = head.next.next.next.next;
               head.next.next.next.arbit = head.next.next;
               head.next.next.next.next.arbit = head.next;

               //print the original list
                 System.out.println("The original linked list: ");
                 printList(head);

                 //function call
                 Node sol = new GFG().cloneLinkedList(head);
                 printList(sol);

             }
        }


