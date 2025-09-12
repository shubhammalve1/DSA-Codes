package dsa.recursion;

public class SummationOfFirstNNaturalNumbers {
    public static void main(String[] args){
        //System.out.println(sumOfNumbers(0,3));
        System.out.println(sumOfNumbers2(3));
    }

    public static int sumOfNumbers(int sum, int num){
        if(num < 1) {
            return sum;
        }
        return sumOfNumbers(sum + num, num - 1);
    }

    public static int sumOfNumbers2(int num){
        if(num == 0) return 0;

        return num + sumOfNumbers2(num - 1);
    }
}
