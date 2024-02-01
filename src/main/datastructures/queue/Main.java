package queue;

public class Main {

    public static void main(String[] args){
        Queue myQueue = new Queue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());

    }
}
