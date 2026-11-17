package Queue;

import java.util.*;

public class QueueUsingTwoStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add - Enqueue - O(n)
        public static void add(int data) {
            // s1 ke saare elements ko s2 me daalo
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // naya data s1 me daalo
            s1.push(data);

            // wapas s2 se s1 me daal do
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove - Dequeue - O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // peek - O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}