package exercises.e14;

public class LinkedListUno {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListUno(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // WRITE FINDKTHFROMEND METHOD HERE //
    //                                  //
    //                                  //
    //                                  //
    //                                  //
    //////////////////////////////////////


    public Node findKthFromEnd(int k) {
        if(k<0) {   //  Boundary Condition
            return null;
        }

        if(head == null & tail == null) //  If len == 0
            return null;
        else if(head == tail) {    //  if len == 1
            return (k==1) ? head : null;
        }
        else {
            Node now = head.next;
            int length=2, index;
            while(now.next != null) {
                now=now.next;
                length++;
            }

            System.out.println("Length of given list: " + length);
            index = length-k;
            System.out.println("Which node from end: " + k + "\nIndex: " + index);

            return (k <= length) ? fetchNodeUsingIndex(index) : null;
        }
    }

    private Node fetchNodeUsingIndex(int i) {
        Node now = this.head;
        while(i > 0) {
            now=now.next;
            i--;
        }
        return now;
    }
}

