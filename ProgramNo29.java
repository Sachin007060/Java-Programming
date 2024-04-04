import java.util.Scanner;

public class ProgramNo29 {
    int palindromeNumber(int number){
        int rev = 0;
        while (number>0) {
            int rem=0;
            rem = number%10;
            rev = (rev*10)+rem;
            number/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int temp  = number;
        ProgramNo29 obj = new ProgramNo29();
        if(obj.palindromeNumber(number) == temp)
            System.out.println(temp + " Is a Palindrome number");
        else
            System.out.println(temp+" Is not palindrome number");
        sc.close();
    }
}