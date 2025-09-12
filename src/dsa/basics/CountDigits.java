package dsa.basics;

public class CountDigits {
    public static int countDigits(int number){
        int count = 0;
        int temp = number;

        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println(countDigits(123654789));
    }
}
