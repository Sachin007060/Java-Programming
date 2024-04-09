// 45.WAP TO CALCULATE FACTORIAL IF THE DIGIT IS ODD IN A NUMBER.

import java.util.Scanner;

public class ProgramNo45 {
    private int factorialNumber(int number){
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo45 obj = new ProgramNo45();
        while(number>0){
            int rem = 0;
            rem = number%10;
            if(rem%2 != 0){
                System.out.print(rem+ " (factorial: "+obj.factorialNumber(rem)+"), ");
            }
            number/= 10;
        }
        sc.close();
    }
}

