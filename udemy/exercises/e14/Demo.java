package exercises.e14;

public class Demo {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
//        LinkedListUno myList = new LinkedListUno(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        LinkedList.Node result = myList.findKthFromEnd(2); // Output: Node with value 4
//        LinkedListUno.Node result = myList.findKthFromEnd(2); // Output: Node with value 4
        System.out.println("***********Result: " + ((result == null) ? null : result.value));

        result = myList.findKthFromEnd(5); // Output: Node with value 1
        System.out.println("***********Result: " + ((result == null) ? null : result.value));

        result = myList.findKthFromEnd(6); // Output: null
        System.out.println("***********Result: " + ((result == null) ? null : result.value));
    }
}