//  34.CALCULATE THE SUM OF SQUARE OF EACH DIGIT IF DIGIT IS EVEN IN A NUMBER.

import java.util.Scanner;

public class ProgramNo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number>0) {
            int rem = 0;
            rem = number%10;
            if(rem%2==0){
                sum+=rem*rem;
            }
            number = number/10;
        }
        System.out.println("Sum of square of each digit if digit is even in a number: "+sum);
        sc.close();
    }
}