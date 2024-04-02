import java.util.Scanner;

public class ProgramNo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int rem =0;
        while (number>0) {
            rem = number%10;
            if(rem%2!=0){
                System.out.print(rem+" ");
            }
            number/=10;
        }
        sc.close();
    }
}
