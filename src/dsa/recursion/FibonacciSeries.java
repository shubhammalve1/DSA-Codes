package dsa.recursion;

public class FibonacciSeries {
    public static void main(String[] args){
        System.out.println(fibo(4));
    }

    public static int fibo(int num){
        if(num <= 1) return num;

        int lastNum = fibo(num-1);
        int secLastNum = fibo(num-2);

        return lastNum + secLastNum;
    }
}
