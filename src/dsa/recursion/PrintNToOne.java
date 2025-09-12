package dsa.recursion;

public class PrintNToOne {
    public static void main(String[] args){
        //printNToOne(10);
        printNToOneBackTracking(1,3);
    }

    public static void printNToOne(int num){
        if(num == 0) return;

        System.out.println(num);
        printNToOne(--num);

    }

    public static void printNToOneBackTracking(int num1 , int num2){
        if(num1 > num2) {
            return;
        }

        printNToOneBackTracking(num1+1, num2);
        System.out.println(num1);
    }
}
