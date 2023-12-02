import java.util.Scanner;

public class ProgramNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18)
            System.out.println("You are eligible for marrige");
        else if(age<18 && age>=0)
            System.out.println("You are not eligible for marrige");
        else
            System.out.println("You write a wrong entry");
        sc.close();
    }
}
