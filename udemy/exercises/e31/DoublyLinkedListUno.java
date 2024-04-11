package exercises.e31;

public class DoublyLinkedListUno {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedListUno(int value) {
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
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        length++;
    }

    public void swapNodePairs() {
        // Create a placeholder (dummyNode) node to simplify swapping.
        Node dummyNode = new Node(0);

        // Link the dummyNode node to the start of our list.
        dummyNode.next = head;

        // Initialize 'previousNode' to 'dummyNode' to remember the node
        // before each pair we're swapping.
        Node previousNode = dummyNode;

        // Continue as long as there's a pair of nodes to swap.
        while (head != null && head.next != null) {

            // Identify the first node of the pair to swap.
            Node firstNode = head;

            // Identify the second node of the pair to swap.
            Node secondNode = head.next;

            // Connect the previousNode's 'next' pointer to secondNode,
            // essentially skipping over firstNode.
            previousNode.next = secondNode;

            // Connect firstNode to the node after secondNode.
            // This ensures we don't lose the rest of the list.
            firstNode.next = secondNode.next;

            // Connect secondNode back to firstNode,
            // completing the swap.
            secondNode.next = firstNode;

            // Adjust 'prev' pointers for our doubly linked list.
            // Set secondNode's 'prev' to the node before current pair.
            secondNode.prev = previousNode;

            // Set firstNode's 'prev' to secondNode as they've been swapped.
            firstNode.prev = secondNode;

            // If there's a node after our current pair, set its 'prev' to firstNode.
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            // Move the head pointer to the node after the current pair.
            head = firstNode.next;

            // Update 'previousNode' for the next pair of nodes.
            previousNode = firstNode;
        }

        // After swapping all pairs, update our list's head to
        // start at the node after dummyNode.
        head = dummyNode.next;

        // Ensure the new head's 'prev' is null, indicating the start of list.
        if (head != null) head.prev = null;
    }

}

