package dsa.recursion;

import java.util.ArrayList;
import java.util.List;
/*
[1]
[1, 3]
[1, 3, 2]
[3]
[3, 2]
[2]
[1, 2] and [ ] remains!
 */
public class SubSequencesUsingRecursion {
    public static void main(String[] args){
        //Integer[] arr = {1,3,2};
        //subSequences(arr);
        Integer[] arr = {1,2,3};
        List<Integer> subSequence = new ArrayList<>();
        subSequence2(arr, subSequence, 0);

    }

    public static void subSequences(Integer[] arr){
        int ptr1 = 0, ptr2 = 0;

        while(ptr1 < arr.length && ptr2 < arr.length){

            List<Integer> subSequence = new ArrayList<>();

            for(int i = ptr1; i<= ptr2; i++){
                subSequence.add(arr[i]);
            }

            System.out.println(subSequence);
            ptr2++;

            if(ptr2 == arr.length){
                ptr1++;
                ptr2 = ptr1;
            }
        }
    }

    public static void subSequence2(Integer[] arr, List<Integer> subSequence, int idx){
        if(idx >= arr.length){
            System.out.println(subSequence);
            return;
        }

        subSequence.add(arr[idx]);
        subSequence2(arr, subSequence, idx+1);

        subSequence.remove(arr[idx]);
        subSequence2(arr, subSequence, idx+1);

    }
}
