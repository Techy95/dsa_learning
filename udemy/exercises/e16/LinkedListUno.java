package exercises.e16;

import java.util.HashSet;
import java.util.Set;


public class LinkedListUno {

    private Node head;
    private int length;

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
        // Step 1: Create a Set to store unique node values.
        // We initialize a HashSet, which allows for fast look-up
        // to check for duplicates later on.
        Set<Integer> values = new HashSet<>();

        // Step 2: Initialize a Node variable 'previous' to null.
        // 'previous' will help us unlink a node if it's a duplicate.
        Node previous = null;

        // Step 3: Initialize 'current' to point to the head node.
        // 'current' will be used to iterate through the linked list.
        Node current = head;

        // Step 4: Begin iteration through the linked list.
        // We will keep iterating until 'current' becomes null,
        // indicating we have reached the end of the list.
        while (current != null) {

            // Step 5: Check for duplicates.
            // We check if the current node's value is already in the set.
            if (values.contains(current.value)) {

                // Step 6: Remove the duplicate node.
                // By setting 'previous.next' to 'current.next',
                // we remove the link to 'current', effectively
                // deleting it from the list.
                previous.next = current.next;

                // Step 7: Update the length of the list.
                // Since we removed a node, we decrement the length by 1.
                length -= 1;

            } else {

                // Step 8: Add unique value to set.
                // If the current value is not a duplicate,
                // we add it to the set for future reference.
                values.add(current.value);

                // Step 9: Update 'previous' node.
                // We set 'previous' to the 'current' node, as we
                // move forward in the list.
                previous = current;
            }

            // Step 10: Move to the next node.
            // We update 'current' to point to the next node in the list,
            // continuing our iteration.
            current = current.next;
        }
    }
}

