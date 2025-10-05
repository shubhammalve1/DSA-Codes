package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class CountOfSubSequenceWhoseSumIsK {
    public static void main(String[] args){
        Integer[] arr = {1,2,3};
        List<Integer> subSequence = new ArrayList<>();
        int k = 3;
        int idx = 0;
        int sum = 0;

        System.out.println(subSequenceSum(arr, sum, k, idx));
    }

    public static int subSequenceSum(Integer[] arr, int sum, int k, int idx){

        if(idx >= arr.length){
            if(sum == k) {
                return 1;
            } else {
                return 0;
            }
        }

        sum += arr[idx];
        int l = subSequenceSum(arr, sum, k,idx+1);

        sum -= arr[idx];
        int r = subSequenceSum(arr, sum, k,idx+1);

        return l+r;
    }
}
