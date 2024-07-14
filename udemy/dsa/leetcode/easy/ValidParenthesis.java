package dsa.leetcode.easy;

public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis v = new ValidParenthesis();
        System.out.println("()()({}) : " + v.isValid("()()({})"));
        System.out.println("()[]{} : " + v.isValid("()[]{}"));
        System.out.println("(] : " + v.isValid("(]"));
        System.out.println(")( : " + v.isValid(")("));
        System.out.println("][ : " + v.isValid("]["));
        System.out.println("}{ : " + v.isValid("}{"));
        System.out.println("({[](){}[]}) : " + v.isValid("({[](){}[]})"));
        System.out.println("(() : " + v.isValid("(()"));
        System.out.println("{[()]} : " + v.isValid("{[()]}"));
        System.out.println("Empty String : " + v.isValid(""));
        System.out.println("null String : " + v.isValid(null));
    }

    public boolean isValid(String s) {
        if(s == null || s.trim().equalsIgnoreCase("") || (s.length()%2 != 0))
            return false;

        java.util.Stack<Character> stack = new java.util.Stack<>();
        boolean isValid = true;

//        char[] charArray = s.toCharArray();
        for(char c : s.toCharArray()/*charArray*/) {
//            System.out.println(c + "\t" + c);
            switch (c) {
                case '(' :
                case '[' :
                case '{' :
                    stack.push(c);
                    break;
                case ')' :
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isValid = false;
                    }
                    break;
                case '}' :
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        isValid = false;
                    }
                    break;
                case ']' :
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isValid = false;
                    }
                    break;
                default :
                    isValid = false;
                    break;
            }
        }
        return isValid && stack.empty();
    }
}
