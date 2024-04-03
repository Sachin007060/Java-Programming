import java.util.Scanner;

public class ProgramNo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int count = 0;
        while (number>0) {
            int rem = 0;
            rem = number%10;
            if(rem%2==0){
                count++;
            }
            number/=10;
        }
        System.out.print("Even digit present in the number: "+count);
        sc.close();
    }
}
