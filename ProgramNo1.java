import java.util.Scanner;

public class ProgramNo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        if(number >=0){
            System.out.println(number+" Is a positive number");
        }else{
            System.out.println(number+" Is not a positibe number");
        }
        sc.close();
    }
}