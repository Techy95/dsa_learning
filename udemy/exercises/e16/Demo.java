package exercises.e16;

public class Demo {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
//        LinkedListUno myList = new LinkedListUno(1);
        myList.append(2);
        myList.append(4);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        myList.append(2);
        myList.append(1);
        myList.append(6);


        System.out.println("***********INPUT: ");
        myList.printAll();
        myList.removeDuplicates(); // LinkedList: 1 -> 2 -> 3 -> 4 -> 5
//        LinkedListUno.Node result = myList.findKthFromEnd(2); // Output: Node with value 4
        System.out.println("\n\n\n\n***********\n\nResult: ");
        myList.printAll();

    }
}