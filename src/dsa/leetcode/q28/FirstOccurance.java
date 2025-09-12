package dsa.leetcode.q28;
/*
Given two strings needle and haystack,
return the index of the first occurrence
of needle in haystack, or -1 if needle
is not part of haystack.
 */

//Find the Index of the First Occurrence in a String

public class FirstOccurance {
    public static void main(String[] args){
        String str1 = "iamshubhamthegreatman";
        String str2 = "shu";

        int count = firstOccurance(str1, str2);
        System.out.println(count);
    }

    public static int firstOccurance(String str1, String str2){
        int count = 0;
        String[] arr1 =  str1.split("");
        String[] arr2 = str1.split(str2);
        for(int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");

            if(arr2[i] == arr1[0] && arr2[i] == arr1[str1.length()-1]) {
                count++;
            }
        }

        return count;
    }
}
