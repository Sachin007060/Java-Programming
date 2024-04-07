// 41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.->IN CLASS

import java.util.Scanner;

class PerfectNumber{
    private int sum = 0;

    int perfectNumber(int number){
        for(int i=1; i<number; i++){
            if(number%i == 0)
                sum += i;
        }
        return sum;
    }
}

public class ProgramNo41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        PerfectNumber obj = new PerfectNumber();
        if(obj.perfectNumber(number) == number && number != 0)
            System.out.println(number+" Is a perfect Number: ");
        else
            System.out.println(number+" Is not a perfect Number: ");
        sc.close();
    }
}
