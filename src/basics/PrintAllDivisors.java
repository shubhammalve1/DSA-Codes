package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args){
      printAllDivisorsFirstWay(12);
      printAllDivisorsSecondWay(12);
    }

    public static void printAllDivisorsFirstWay(int number){
        List<Integer> listOfDivisors = new ArrayList<>();
        for(int i = 1; i<= number; i++){
            if(number % i == 0){
                listOfDivisors.add(i);
            }
        }
        System.out.println("Divisors: " + listOfDivisors + " ");
    }

    public static void printAllDivisorsSecondWay(int number){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i*i<=number; i++){
            if(number % i == 0){
                list.add(i);

                if((number/i) != i){
                    list.add(number/i);
                }
            }
        }

        list.sort(Comparator.comparingInt(a -> a));
        System.out.println("Divisors: " + list);
    }
}
