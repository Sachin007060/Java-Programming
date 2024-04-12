// 54.DESIGN A METHOD TO CALCULATE SUM OF EVEN DIGITS AND RETURN, INSIDE MAIN METHOD CALCULATE SQUARE OF RETURNING RESULT.

import java.util.Scanner;

public class ProgramNo54 {
    int SumOfEvenDigit(int number){
        int sum = 0;
        while (number>0) {
            int rem = 0;
            rem = number%10;
            if(rem%2==0){
                sum += rem;
            }
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo54 obj = new ProgramNo54();
        int result = obj.SumOfEvenDigit(number);
        System.out.println(result);
        System.out.print("Square of the result: "+result*result);
        sc.close();
    }
}