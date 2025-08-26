package basics;

public class ReverseTheNumber {
    public static void main(String[] args){
        System.out.println(reverseTheNumber(123456));
    }

    public static int reverseTheNumber(int number){
        int temp = number;
        int digit = 0;
        int reverseNumber = 0;

        while(temp > 0){
            digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            temp = temp /10;

        }

        return reverseNumber;
    }
}
