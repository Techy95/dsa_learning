package exercises.e17;

public class Demo {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(0);
//        LinkedListUno myList = new LinkedListUno(1);
        myList.append(0);
        myList.append(0);
        myList.append(1);
//        myList.append(1);


        System.out.println("***********INPUT: ");
        System.out.println("Decimal value: " + myList.binaryToDecimal()); // LinkedList: 1  -> 0 -> 1   :   5
//        LinkedListUno.Node result = myList.findKthFromEnd(2); // Output: Node with value 4
//        System.out.println("\n\n\n\n***********\n\nResult: ");

    }
}