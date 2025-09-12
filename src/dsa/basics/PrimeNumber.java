package dsa.basics;

public class PrimeNumber {
    public static void main(String[] args){
        //System.out.println(isPrime(7));
        System.out.println(isPrimeOptimized(5));
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

    public static boolean isPrimeOptimized(int number){
        int count = 0;
        for(int i = 1; i*i<number; i++) {
            if(number % i == 0){
                count++;

                if(number/i != i){
                    count++;
                }
            }
        }

        if(count == 2){
            return true;
        } else {
            return false;
        }
    }

}
