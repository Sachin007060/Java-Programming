// 56.WAP TO DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER AND CALCULATE SUM.->IN CLASS

import java.util.Scanner;

public class ProgramNo56 {
    int factorialOfDigit(int rem){

        int fact = 1;
        for(int i=1; i<=rem; i++){
            fact *=i;
        }
        System.out.println("factorila("+rem+"): "+fact);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo56 obj = new ProgramNo56();
        int sum = 0;
        while (number>0) {
            int rem = 0; 
            rem = number%10;
            sum += obj.factorialOfDigit(rem);
            number /= 10;
        }
        if(sum == 0){
            sum =1;
        }
        System.out.print("Sum of the factorial of each digit: "+sum);
        sc.close();
    }
}