package dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrenceOfCharInString {
    public static void main(String[] args){
        String str = "aaaBBB";
        occurrenceOfChar(str, 5);
    }

    public static void occurrenceOfChar(String str, int queries){
        int hashArr[] = new int[256];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<str.length(); i++){
            hashArr[str.charAt(i)]++;
        }

        while(queries > 0){
            System.out.print("Enter the character: ");
            Character ch = sc.next().charAt(0);
            queries--;

            System.out.println(ch + " occurred " +  hashArr[(int) ch] + " times!!!");
        }
    }
}
