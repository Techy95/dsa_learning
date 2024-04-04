package exercises.e16;

import java.util.HashSet;
import java.util.Set;


public class LinkedList {

    private Node head;
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
        length = 1;
    }

    public Node getHead() {
        return head;
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
        } else {
            System.out.println("Head: " + head.value);
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
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////

    public void removeDuplicates() {
        Set<Integer> ref = new HashSet<>();
        if(length >1) {
            Node before = null;
            Node temp = this.head;
            int decrement = 0;
            for(int i = 0; i < length; i++) {
                if(ref.add(temp.value)) {       //  iterate, as current value is not a duplicate
                    before = temp;
                    temp = temp.next;
                } else {      //  remove temp at this index and rearrange
                    before.next = temp.next;
                    temp.next = null;
                    temp = before.next;
                    decrement++;
                }
            }
            length -=decrement;
        }
    }
}

