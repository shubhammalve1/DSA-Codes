package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class OnlyOneSubSequenceWhoseSumIsK {
    public static void main(String[] args){
        Integer[] arr = {1,2,3};
        List<Integer> subSequence = new ArrayList<>();
        int k = 3;
        int idx = 0;
        int sum = 0;

        subSequenceSum(arr, subSequence, sum, k, idx);
    }

    public static boolean subSequenceSum(Integer[] arr, List<Integer> subSequence, int sum, int k, int idx){

        if(idx >= arr.length){
            if(sum == k){
                System.out.println(subSequence);
                return true;
            } else {
                return false;
            }
        }

        subSequence.add(arr[idx]);
        sum += arr[idx];
        if(subSequenceSum(arr, subSequence, sum, k,idx+1) == true) {
            return true;
        }

        subSequence.remove(arr[idx]);
        sum -= arr[idx];
        if(subSequenceSum(arr, subSequence, sum, k,idx+1) == true){
            return true;
        }

        return false;

    }
}
