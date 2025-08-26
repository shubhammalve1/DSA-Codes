package basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        GCDWay2(11,13);
    }

    public static int GCD(int n1, int n2){
        Set<Integer> divisorsNumber1 = new HashSet<>();
        Set<Integer> divisorsNumber2 = new HashSet<>();

        for(int i = 1; i<= n1; i++) {
            if(n1 % i == 0) {
                divisorsNumber1.add(i);
            }
        }

        for(int i = 1; i<= n2; i++){
            if(n2 % i == 0) {
                divisorsNumber2.add(i);
            }
        }

        System.out.println(divisorsNumber1);
        System.out.println(divisorsNumber2);

        divisorsNumber1.retainAll(divisorsNumber2);
        System.out.println(divisorsNumber1);
        return 0;
    }

    public static void GCDWay2(int n1, int n2){
        int gcd = 1;
        for(int i = 1; i*i<=Math.max(n1,n2); i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }

        System.out.println("GCD: " + gcd);
    }
}
