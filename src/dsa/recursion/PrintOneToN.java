package dsa.recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        //printOneToN(1,10);
        printOneToNBackTracking(1,3);
    }

    public static void printOneToN(int num1, int num2){
        if(num1 > num2)
            return;

        System.out.println(num1++);
        printOneToN(num1, num2);

    }

    public static void printOneToNBackTracking(int num1, int num2){
        if(num1 > num2) return;

        printOneToNBackTracking(num1, num2-1);
        System.out.println(num2);
    }
}
