// 62.WAP TO CHECK WHETHER NUMBER IS PRIME NO OR NOT.->IN CLASS

import java.util.Scanner;

public class ProgramNo62{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int count = 0;
        for(int i=1; i<=number; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print(number+" is a Prime Number");
        }else{
            System.out.print(number+" is a not Prime Number");
        }
        sc.close();
    }
}
