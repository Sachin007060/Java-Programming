// 49.WAP TO CREATE A METHOD TO PERFORM ADDITION OF TWO NOS THEN INSIDE THE MAIN METHOD CHECK THE ADDITION OF TWO NOS IS EVEN OR ODD.->IN CLASS

import java.util.Scanner;

class Addition{
    int addTwoNumber(int val1, int val2){
        return val1+val2;
    }
}

public class ProgramNo49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Addition obj = new Addition();
        int sum = obj.addTwoNumber(num1, num2);
        if(sum%2 == 0)
            System.out.print("Sum of the both values is "+sum+" and it is Even Number");
        else
            System.out.print("Sum of the both values is "+sum+" and it is Odd Number");
        sc.close();
    }
}