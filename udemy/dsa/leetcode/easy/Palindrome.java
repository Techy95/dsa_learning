package dsa.leetcode.easy;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println("121 : " + p.isPalindrome(121));
        System.out.println("-121 : " + p.isPalindrome(-121));
        System.out.println("10 : " + p.isPalindrome(10));
        System.out.println("5555 : " + p.isPalindrome(5555));
        System.out.println("55555 : " + p.isPalindrome(55555));
        System.out.println("55455 : " + p.isPalindrome(55455));
        System.out.println("1313 : " + p.isPalindrome(1313));
        System.out.println("1331 : " + p.isPalindrome(1331));
    }

    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int test = x, reverse = 0;

        while(test > 0) {
            reverse *= 10;
            reverse += test%10;
            test /= 10;
        }

        return reverse == x;
    }
}