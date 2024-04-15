// 61.DESIGN A METHOD TO COUNT NO OF DIGITS IN A NUMBER


import java.util.Scanner;

public class ProgramNo61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int count = 0;
        while(number>0){
            number /= 10;
            count++;
        }
        System.out.print("Total digits in a number is: "+count);
        sc.close();
    }    
}
