import java.util.Scanner;

public class ProgramNo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int rev = 0,sum = 0;
        while (number>0) {
            rev = number%10;
            sum+=rev;
            number/=10;
        }
        System.out.println("Sum of all the digits of numbers is = "+sum);
        sc.close();
    }
}
