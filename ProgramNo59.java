// 59.WAP TO CHECK ****SPECIAL TWO DIGIT NUMBER****.->IN CLASS

import java.util.Scanner;

public class ProgramNo59 {
    int specialTwoDigit(int num) {
        int mul = 1;
        while (num > 0) {
            int rem = 0;
            rem = num % 10;
            mul *= rem;
            num /= 10;
        }
        return mul;
    }

    int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = 0;
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int number = sc.nextInt();
        int temp = number;
        ProgramNo59 obj = new ProgramNo59();
        int result = obj.specialTwoDigit(number) + obj.sumOfDigit(number);
        if (result == temp) {
            System.out.print(temp + " IS SPECIAL TWO DIGIT NUMBER");
        } else {
            System.out.print(temp + " IS NOT SPECIAL TWO DIGIT NUMBER");
        }

        sc.close();
    }
}
