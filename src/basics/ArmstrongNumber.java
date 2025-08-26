package basics;

/*
371 = addition of cube of each digit is the number itself is called Armstrong Number

 */
public class ArmstrongNumber {
    public static void main(String[] args){
    System.out.println(isArmstrong(35));
    }

    public static boolean isArmstrong(int number){
        int temp = number;
        int sum = 0;
        int digit = 0;
        while(temp > 0){
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if(number == sum){
            return true;
        } else {
            return false;
        }
    }


}
