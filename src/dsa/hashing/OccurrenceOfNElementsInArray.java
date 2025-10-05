package dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrenceOfNElementsInArray {
//    public static void main(String[] args){
//        //Integer[] arr = {1,2,1,3,2};
//        //occurrence(arr);
//
//        int[] arr = {1,2,1,3,2};
//        occurrenceOfNQueries(arr, 5);
//    }
//
//    public static void occurrence(Integer[] arr){
//        int hashArr[] = new int[4];
//
//        for(int i = 0; i<hashArr.length; i++){
//            hashArr[arr[i]]++;
//        }
//
//        for(int i = 0; i<hashArr.length; i++){
//            System.out.println(i + " occurs " + hashArr[i] + " times");
//        }
//    }
//
//    public static void occurrenceOfNQueries(int[] arr, int queries){
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int num: arr){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        while(queries > 0) {
//            System.out.println("Enter Value to find occurrence: ");
//            int value = sc.nextInt();
//
//            System.out.println(value + " occurs " + map.getOrDefault(value, 0) + " times!");
//            queries--;
//        }
    public static void main(String[] args){
        Integer[] arr = {1,2,1,3};
        occurrence(arr, 5);
    }

    public static void occurrence(Integer[] arr, int queries){
        int hashArr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            hashArr[arr[i]]++;
        }

        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(i, hashArr[i]);
        }

        while(queries > 0){
            System.out.print("Enter the Number: ");
            int value = sc.nextInt();
            System.out.println(value + " occurred " + map.getOrDefault(value, 0) + " times!!!");
            queries--;
        }





    }
}
