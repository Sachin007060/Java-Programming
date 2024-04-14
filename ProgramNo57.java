// 57.WAP TO CHECK NUMBER IS ****STRONG NUMBER**** OR NOT.->IN CLASS

import java.util.Scanner;

public class ProgramNo57 {
    int factorilaOfDigit(int rem){
        int fact = 1;
        for(int i= 1; i<=rem; i++){
            fact *=i;
        }
        return fact;
    }

    int strongNumber(int number){
        int sum = 0;
        if(number == 0){
            return 1;
        }
        while (number>0) {
                    int rem = 0;
                    rem = number%10;
                    sum += factorilaOfDigit(rem);
                    number /= 10;
                }
                return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo57 obj = new ProgramNo57();
        int temp = number;
        if(temp == obj.strongNumber(number)){
            System.out.println(temp+" is a Strong number");
        }else {
            System.out.println(temp+" is not a Strong number");
        }
        sc.close();
    }
}