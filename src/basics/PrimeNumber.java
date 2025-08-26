package basics;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(int number){
        for(int i = 2; i<= number; i++){
            if(number % i == 0) {
                return false;
            } else {
                return true;
            }
        }

       return false;
    }

}
