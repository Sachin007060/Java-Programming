// 44.WAP TO EXTRACT THE DIGIT IN A NO IF THE DIGIT IS EVEN THEN FIND FACTORIAL.

import java.util.Scanner;

public class ProgramNo44 {
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
        ProgramNo44 obj = new ProgramNo44();
        while(number>0){
            int rem = 0;
            rem = number%10;
            if(rem%2 == 0 ){
                System.out.print(rem+ " (factorial: "+obj.factorialNumber(rem)+"), ");
            }
            number/= 10;
        }
        sc.close();
    }
}
