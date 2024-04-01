import java.util.Scanner;

public class ProgramNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        if(number == 8 || number == 10 || number == 11)
            System.out.println("GoodMorning");
        else
            System.out.println("Typed number is: " +number);
        sc.close();
    }
}