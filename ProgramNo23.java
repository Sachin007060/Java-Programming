import java.util.Scanner;

public class ProgramNo23{
    void swapNumber(int v1, int v2){
        System.out.println("Value are: "+"value1 = "+v1+" "+"value2 = "+v2);
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println("After swap: "+"value1 = "+v1+" "+"value2 = "+v2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Two number: ");
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        ProgramNo23 obj = new ProgramNo23();
        obj.swapNumber(value1, value2);
        sc.close();
    }
}