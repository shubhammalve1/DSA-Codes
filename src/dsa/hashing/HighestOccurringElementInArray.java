package dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElementInArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(highestOccurringElement(arr));
    }

    public static int highestOccurringElement(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for(int ele: arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int maxFrequency = 0;
        int ans = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int element = entry.getKey();
            int frequency = entry.getValue();

            if(frequency > maxFrequency) {
                maxFrequency = frequency;
                ans = element;

            } else if (frequency == maxFrequency && element < ans) {
                ans = element;
            }
        }

        return ans;

    }
}
