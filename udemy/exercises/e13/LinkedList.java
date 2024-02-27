package exercises.e13;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
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

    // WRITE HASLOOP METHOD HERE //
    //  OWN Solution - 1st try
//    public boolean hasLoop() {
//
//        boolean hasLoop = false;
//
//        if(head == null && tail == null) {
//            return hasLoop;
//        }
//
//        Node slow = this.getHead(), fast = this.getHead();
//        while(fast.next != null) {
//            fast=fast.next;
//
//            if(fast.next == null) {
//                break;
//            }
//
//            if(fast == slow) {
//                hasLoop = true;
//                break;
//            }
//
//            slow=slow.next;
//            fast=fast.next;
//        }
//
//        return hasLoop;
//    }


    //  Optimum Solution

    public boolean hasLoop() {
        Node slow = this.head, fast = this.head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}