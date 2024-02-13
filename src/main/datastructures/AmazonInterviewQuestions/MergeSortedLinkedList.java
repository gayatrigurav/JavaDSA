package AmazonInterviewQuestions;

public class MergeSortedLinkedList {

    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }



    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public static void main(String[] args) {
        MergeSortedLinkedList l1 = new MergeSortedLinkedList();
        MergeSortedLinkedList l2 = new MergeSortedLinkedList();

        l1.append(5);
        l1.append(10);
        l1.append(15);
        //l1.printList();

        l2.append(6);
        l2.append(8);
        l2.append(18);
        // l2.printList();

        l1.head = new gfh().mergeLists(l1.head,l2.head);
        l1.printList();

    }


    static class gfh {
        public Node mergeLists(Node A, Node B) {

            if (A == null)
                return B;
            if (B == null)
                return A;

            if (A.value < B.value) {
                A.next = mergeLists(A.next, B);
                return A;
            } else {
                B.next = mergeLists(A, B.next);
                return B;
            }
        }
    }
}




