package dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rough {
    public static void main(String[] args){
        int[] arr = {1,2,2,1,3};
        System.out.println(frequencyOccurrence(arr));
    }

    public static List<?> frequencyOccurrence(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        //step - 1: Count Occurrence
        for(int number: arr){
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        //Step - 2: Convert to list of pairs
        List<List<Integer>> resultList = new ArrayList<>();

        for(int key: map.keySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(key);
            pair.add(map.get(key));
            resultList.add(pair);
        }

        return resultList;
    }
}