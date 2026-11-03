/*public class LinkedList {
    class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static node head;
    public static node tail;

    public static int size;

    // Adding node first in LinkedList
    public void addfirst(int data) {

        // Step 1:- Create a new node
        node newnode = new node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        // Step 2:-newnode next=head
        newnode.next = head; // link

        // Step 3:- head=newnode
        head = newnode;

    }

    // Addind node in last
    public void addlast(int data) {
        // create a new node
        node newnode = new node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;

    }

    // Print a Linked List
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Adding node in middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        node newnode = new node(data);
        size++;
        node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1; temp->prev
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Perv: i=size-2
        node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    } */

    /*
     * Search(Iterative)
     * Search for a key in a Linked list . Return the position where it is found.
     * if not found, return -1
     */

    /*  public int iterativeSearch(int key) {
        node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    /* Search for a key by using recursion */

   /* public int helper(node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;

        }
        return idx + 1;
    }

    // Wrapper for helper - This Fixes your error
    public int Search(int key) {
        return helper(head, key);
    }

    // Reverse a Linked List
    public void reverse() {
        node prev = null;
        node curr = tail = head;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int iTofind = sz - n;
        node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    } */

    // Creating ,Adding, Removing, Linked List by using Java Collection Framework
     import java.util.LinkedList;

    public static void main(String args[]) {

        //Create
        LinkedList<Integer>LL=new LinkedList<>();

        //add
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(0);

        System.out.println(LL);

        //remove
        LL.removeLast();
        LL.removeFirst();
        System.out.println(LL);


      /*   LinkedList LL = new LinkedList();
        LL.addfirst(1);
        LL.addfirst(2);
        LL.addlast(3);
        LL.add(2, 9);
        LL.addlast(4);
        LL.print();

        // System.out.println(LL.size);
        /*
         * LL.removeFirst();
         * LL.print();
         * LL.removeLast();
         * LL.print();
         */

        System.out.println("Index of 9 is:" + LL.Search(9));
        LL.reverse();
        LL.print(); 
    }

    
}
