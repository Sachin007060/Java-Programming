// 51. DESIGN A METHOD TO RETURN SQUARE OF THE NO.

import java.util.Scanner;

public class ProgramNo51{
    int sqr(int number){
        return number*number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo51 obj = new ProgramNo51();
        System.out.print("Square of a "+number+" is: "+obj.sqr(number));
        sc.close();
    }
}
