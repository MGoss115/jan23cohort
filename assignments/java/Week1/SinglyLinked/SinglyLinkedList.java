// package assignments.java.Week1.SinglyLinked;

public class SinglyLinkedList {
    public Node head;
    public Node runner;
    public Node tail;
    public int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // tail is provided and we're adding a node to the end of the list
    public void addFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addBack(int value) {
        if (tail == null) {
            addFront(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertIndex(int value, int index) {
        if (index == 0) {
            addFront(value);
            return;
        }
        if (index == size) {
            addBack(value);
            return;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node newNode = new Node(value, current.next);
        current.next = newNode;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return val;
    }

    public void remove() {
        if (head == null) {
            return;
        } else {
            // Node prev = null;
            Node current = head;
            while (current.next.next != null) {
                // prev = current;
                current = current.next;
            }
            current.next = null;
        }
    }

    public boolean find(int value) {
        if (head == null) {
            return false;
        }

        Node current = head;
        while (current.next != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printValues() {
        Node current = head; // temp variable not reassigning head
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("End of list");

    }
}
