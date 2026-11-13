/*

Palindrome Linked List:-
We have a singly linked list of characters, write a function that returns true if the given list is a
palindrome, else false 

Input : A->B->C->B->A
Output : Yes It is Palindrome
*/

import java.util.*;

public class PalindromeA_LinkedList_Using_Stack {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public static boolean isPalindromeStack(Node head) {
        Stack<Character> s = new Stack<>();
        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != s.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // Creating list A->B->C->B->A
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        // Print Input
        Node temp = head;
        System.out.print("Input : ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print("->");
            temp = temp.next;
        }
        System.out.println();

        // Check
        if (isPalindromeStack(head)) {
            System.out.println("Output : Yes It is Palindrome");
        } else {
            System.out.println("Output : Not Palindrome");
        }
    }
}