package Queue;

import java.util.*;

public class Deque_Demo {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // addFirst()
        dq.addFirst(10);
        dq.addFirst(20); // dq = [20, 10]

        // addLast()
        dq.addLast(30);
        dq.addLast(40); // dq = [20, 10, 30, 40]

        System.out.println("Deque: " + dq);

        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());

        System.out.println("Removed First: " + dq.removeFirst());
        System.out.println("Removed Last: " + dq.removeLast());

        System.out.println("Final Deque: " + dq);
    }
}
