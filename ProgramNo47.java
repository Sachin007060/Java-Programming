// 47.WAP TO CALCULATE SUM OF FACTORIAL OF ODD DIGIT IN A NUMBER.

import java.util.Scanner;

public class ProgramNo47 {
    private int factorialNumber(int number){
        int fact =1;
        if(number == 0){
            return 1;
        }
        for(int i=1; i<=number; i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo47 obj = new ProgramNo47();
        int sum =0;
        while (number>0) {
            int rem = 0;
            rem = number%10;
            if(rem%2 != 0){
                int fact = obj.factorialNumber(rem);
                sum += fact;
            }
            number /= 10;
        }
        System.out.print("Sum of factorials of odd digits: "+sum);
        sc.close();
    }
}