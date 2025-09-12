package dsa.recursion;

public class PrintName {
    public static void main(String[] args) {
        printName("Shubham", 5);
    }

    public static void printName(String name, int count){
        if(count == 0)
            return;

        System.out.println(name);
        count--;
        printName(name, count);

    }
}
