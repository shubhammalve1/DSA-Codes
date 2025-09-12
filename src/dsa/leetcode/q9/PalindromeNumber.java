package dsa.leetcode.q9;


public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int number = x;
        int digit = 0;
        int reverseNumber = 0;

        while(number > 0){
            digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }

        if(x == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
