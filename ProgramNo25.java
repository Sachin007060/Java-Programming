import java.util.Scanner;

public class ProgramNo25 {
    int countNumber(int n){
        int count = 0;
        while (n>0) {
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        ProgramNo25 obj = new ProgramNo25();
        System.out.println("Total digit in a number: "+obj.countNumber(number));
        sc.close();
    }
}