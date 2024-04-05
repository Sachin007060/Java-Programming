// 32.WAP TO CALCULATE SQUARE OF THE DIGIT IN A NUMBER.IF THE DIGIT IS EVEN THEN ONLY FIND THE SQUARE.

import java.util.Scanner;

public class ProgramNo32 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        System.out.print("All the even digit's square present in the Number: ");
        while (number>0) {
            int rem  = 0;
            int result = 0;
            rem = number%10;
            if(rem%2==0){
                result = rem*rem;
                System.out.print(result+" ");
            }
            number/=10;
        }
        sc.close();
    }
}
