// 33.WAP TO CALCULATE CUBE OF EVERY DIGIT IF DIGIT IS ODD IN A NUMBER.

import java.util.Scanner;

public class ProgramNo33 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        while (number>0) {
            int rem  = 0;
            int result = 0;
            rem = number%10;
            if(rem%2!=0){
                result = rem*rem*rem;
                System.out.print(result+" ");
            }
            number/=10;
        }
        sc.close();
    }
}