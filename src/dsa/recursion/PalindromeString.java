package dsa.recursion;

public class PalindromeString {
    public static void main(String[] args){
        System.out.println(isPalindrome("ABA", 0));
    }

    public static boolean isPalindrome(String str, int idx){

        if(idx >= str.length()/2) return true;

        if(str.charAt(idx) != str.charAt(str.length() - idx - 1)) {
            return false;
        }

        return isPalindrome(str, idx + 1);
    }
}
