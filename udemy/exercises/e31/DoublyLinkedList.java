package exercises.e31;

public class DoublyLinkedList {

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

    public DoublyLinkedList(int value) {
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

    public void swapPairs() {

        if(length >= 2) {
            Node current = this.head, before = this.head.prev, neighbor = current.next;

            while(true) {
                System.out.println("\n\nPrior:");
                System.out.println("\t\t Current: " + current.value);
                System.out.println("\t\t Neighbor: " + neighbor.value);
                if(before != null)
                    System.out.println("\t\t Before: " + before.value);

                current.next = neighbor.next;
                if(neighbor.next != null)
                    neighbor.next.prev = current;
                neighbor.next = current;
                neighbor.prev = before;
                current.prev = neighbor;

                System.out.println("Later:");
                System.out.println("\t\t Current: " + current.value);
                System.out.println("\t\t Neighbor: " + neighbor.value);
                if(before != null) {
                    before.next = neighbor;
                    before = current;
                    System.out.println("\t\t Before: " + before.value);
                } else {
                    this.head = neighbor;
                }

                if(current.next != null && current.next.next != null) {
                    before = current;
                    current = current.next;
                    neighbor = current.next;
                }
                else {
                    break;
                }
                this.printList();
                System.out.println("\n\n");
            }
        }
    }

}

