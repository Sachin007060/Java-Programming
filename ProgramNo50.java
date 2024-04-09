// 50.DESIGN A METHOD TO CALCULATE FACTORIAL OF A NUMBER AND RETURN FACTORIAL.->IN CLASS

import java.util.Scanner;

class Factorial{
    int factorialNumber(int number){
        int fact =1;
        if(number == 0){
            return 1;
        }
        for(int i=1; i<=number; i++){
            fact *= i;
        }
        return fact;
    }
}

public class ProgramNo50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        Factorial obj = new Factorial();
        System.out.print(number+" factorial is: "+obj.factorialNumber(number));
        sc.close();
    }
}