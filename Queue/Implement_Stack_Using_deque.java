package Queue;

import java.util.*;

public class Implement_Stack_Using_deque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek: " + s.peek()); // 3
        System.out.println("Pop: " + s.pop()); // 3
        System.out.println("Peek: " + s.peek()); // 2
    }
}