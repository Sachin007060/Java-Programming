// 65.WAP TO CHECK NO IS ARMSTRONG NUMBER.->IN CLASS

import java.util.Scanner;

public class ProgramNo65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int temp = number;
        int rem =0, sum=0;
        while (number> 0) {
            rem = number%10;
            sum += (rem*rem*rem);
            number /= 10; 
        }
        if(sum == temp)
            System.out.println(temp+" IS A AMSTRONG NUMBER");
        else 
            System.out.println(temp+" IS NOT A AMSTRONG NUMBER");
        sc.close();
    }
}
