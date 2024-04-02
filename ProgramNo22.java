import java.util.Scanner;

public class ProgramNo22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for sum of odd number in digit: ");
        int number = sc.nextInt();
        int sum = 0, rem=0;
        while (number>0) {
            rem = number%10;
            if(rem%2!=0){
                sum += rem;
            }
            number /= 10;
        }
        System.out.print("Sum of the odd number in the digit:- "+sum);
        sc.close();
    }
}