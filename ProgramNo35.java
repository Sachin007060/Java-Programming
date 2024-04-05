// CALCULATE SUM OF CUBE OF EACH DIGIT IF DIGIT IS ODD.

import java.util.Scanner;

public class ProgramNo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int sum =0;
        while (number>0) {
            int rem = 0;
            rem = number%10;
            if(rem%2!=0){
                sum += rem*rem*rem;
            }
            number/=10;
        }
        System.out.print("Sum of cube of each digit if digit is odd in a number: "+ sum);
        sc.close();
    }
}

