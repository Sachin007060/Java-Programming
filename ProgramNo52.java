// 52.DESIGN A METHOD TO RETURN POWER OF A NO

import java.util.Scanner;

public class ProgramNo52{
    int sqr(int num1, int num2){
        int pow = 1;
        for(int i=1; i<=num2; i++){
            pow *= num1;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int expo = sc.nextInt();
        ProgramNo52 obj = new ProgramNo52();
        System.out.print(base+"'s power "+expo+" is = "+obj.sqr(base, expo));
        sc.close();
    }
}