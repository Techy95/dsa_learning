package dsa.exercises.e40;

public class Demo {

    // WRITE THE REVERSESTRING METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////

    public static String reverseString(String test) {
        Stack<Character> chars = new Stack();
        for (char c : test.toCharArray()) {
            chars.push(c);
        }

        StringBuilder sb = new StringBuilder();

        while (!chars.isEmpty()) {
            sb.append(chars.pop());
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */


    }
}