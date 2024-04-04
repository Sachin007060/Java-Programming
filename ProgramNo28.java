import java.util.Scanner;

public class ProgramNo28 {
    int rev(int n){
        int rev=0;
        while (n>0) {
            int rem = 0;
            rem = n%10;
            rev =(rev*10)+rem;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo28 obj = new ProgramNo28();
        System.out.print("Reverse of the number is : "+obj.rev(number));
        sc.close();
    }
}
