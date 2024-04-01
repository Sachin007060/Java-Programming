import java.util.*;

public class ProgramNo17 {
    void reverse(int number){
        int rem = 0;
        while (number>0) {
            rem = number%10;
            number = number/10;
            System.out.print(rem+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for reverse:- ");
        int number = sc.nextInt();
        ProgramNo17 obj = new ProgramNo17();
        obj.reverse(number);
        sc.close();
    }
}