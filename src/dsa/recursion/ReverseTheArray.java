package dsa.recursion;

import java.util.Arrays;
import java.util.List;

public class ReverseTheArray {
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5};
        //reverseTheArray(arr,0, 4);
        reverseTheArray2(arr, 0);
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
    }

    public static Integer[] reverseTheArray(Integer[] arr, int l, int r){
        if(l >= r) return null;

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return reverseTheArray(arr, l + 1, r -1);
    }

    public static Integer[] reverseTheArray2(Integer[] arr, int idx){
        if(idx >= arr.length/2) return null;

        int temp = arr[idx];
        arr[idx] = arr[arr.length - idx - 1];
        arr[arr.length - idx - 1] = temp;

        return reverseTheArray2(arr,idx + 1);

    }
}
