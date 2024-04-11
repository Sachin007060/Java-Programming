// 53.DESIGN A METHOD TO CALCULATE ADDITION OF ALL DIGITS PRESENT IN A NUMBER AND RETURN THE SUM.

import java.util.Scanner;

public class ProgramNo53 {
    int sumOfDigits(int n){
        int sum = 0, rem=0;
        while (n>0) {
            rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number  = sc.nextInt();
        ProgramNo53 obj = new ProgramNo53();
        System.out.println("Sum of all digit present in the number: "+obj.sumOfDigits(number));
        sc.close();
    }
}
