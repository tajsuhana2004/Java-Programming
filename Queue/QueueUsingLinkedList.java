package Queue;

import java.util.*;

public class QueueUsingLinkedList {

    LinkedList<Integer> queue = new LinkedList<>();

    // Enqueue
    void enqueue(int value) {
        queue.addLast(value);
        System.out.println(value + " inserted");
    }

    // Dequeue
    void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int value = queue.removeFirst();
        System.out.println(value + " deleted");
    }

    // Display
    void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int val : queue) {
            System.out.print(val + " -> ");
        }
        System.out.println("NULL");
    }

    // Main Method
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
    }
}