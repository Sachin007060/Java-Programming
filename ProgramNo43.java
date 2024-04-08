// 43.WAP TO CALCULATE FACTORIAL OF A NUMBER.->IN CLASS

import java.util.Scanner;

public class ProgramNo43 {

    int factorialNumber(int number){
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo43 obj = new ProgramNo43();
        System.out.println("Factorial of a number "+number+" Is: "+obj.factorialNumber(number));
        sc.close();
    }
}
