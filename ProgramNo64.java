// WAP TO PRINT FIBONACCI NUMBER SERIES UPTO 10 DIGITS.->IN CLASS

import java.util.Scanner;

public class ProgramNo64{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for series: ");
        int number = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second);
        for(int i=2; i<number; i++){
            int third = first + second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }
        sc.close();
    }
}

