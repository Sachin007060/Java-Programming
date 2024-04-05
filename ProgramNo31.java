import java.util.Scanner;

public class ProgramNo31 {
    double powerOfNumber(double n, int p){
        double result = 1;
        for(int i=0;i<p; i++){
            result *= n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();    
        ProgramNo31 obj = new ProgramNo31();    
        System.out.print(base+" 's power "+exponent+" is: "+obj.powerOfNumber(base, exponent));
        sc.close();
    }
}
