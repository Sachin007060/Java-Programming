// 55.DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER.->IN CLASS

import java.util.Scanner;

public class ProgramNo55 {
    int factorialOfNumber(int rem){
        int fact = 1;
        for(int i=1; i<=rem; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo55 obj = new ProgramNo55();
        while (number>0) {
            int rem = 0;
            rem = number%10;
            System.out.println("factorial of ("+rem+") is: "+obj.factorialOfNumber(rem));
            number /= 10;
        }
        sc.close();
    }
}
