package exercises.e31;

//You are given a doubly linked list.
//
//        Implement a method called swapPairs within the class that swaps the values of adjacent nodes in the linked list. The method should not take any input parameters.
//
//        Note: This DoublyLinkedList does not have a tail pointer which will make the implementation easier.
//
//        Example:
//
//        1 <-> 2 <-> 3 <-> 4
//
//        should become
//
//        2 <-> 1 <-> 4 <-> 3
//
//
//        Your implementation should handle edge cases such as an empty linked list or a linked list with only one node.
//
//        Note: You must solve the problem WITHOUT MODIFYING THE VALUES in the list's nodes (i.e., only the nodes' prev and next pointers may be changed.)

public class Demo {
    public static void main(String[] args) {

        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);
        myDll.append(5);
//        myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();

        myDll.swapPairs();

        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            myDll before swapPairs:
            1 <-> 2 <-> 3 <-> 4

            myDll after swapPairs:
            2 <-> 1 <-> 4 <-> 3

        */

    }
}