package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurance {
    public static void main(String[] args){
        //int[] arr = {1,2,3,4,4,5,6};
        int[] arr = {1,2,3,4,4,4,4};
        int element = 4;
        int index = firstOccurance(arr, element);
        System.out.println("First Occurance at index: " + index);
    }

    public static int firstOccurance(int[] arr, int element){
        int count = 0;
        List<Integer> listOfIndexes = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                count++;
                listOfIndexes.add(i);
                return i;
            }
        }

        System.out.println(listOfIndexes);
        System.out.println("Count: " + count);

        return -1;
    }
}
