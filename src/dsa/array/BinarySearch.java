package dsa.array;

import java.lang.Thread;

public class BinarySearch {
    public static void main(String[] args)throws InterruptedException {
        int[] arr = new int[] {1,2,3,4,5,7,8,9};
        int element = 9;
        int indexOfElement = binarySearch(arr, element);
        Thread.sleep(1000);
        System.out.println("Element at index: "+ indexOfElement);
    }

    public static int binarySearch(int[] arr, int element){
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = (start + end)/ 2;

            if(arr[mid] == element){
                return mid;

            } else if(arr[mid] < element){
               start = mid +1;

            } else {
                end = mid -1;
            }
        }

        return -1;
    }
}
