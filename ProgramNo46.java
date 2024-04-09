// 46.TRACING FOR FACTORIAL PROGRAM 4,6.

public class ProgramNo46 {
    private void factorialNumber(int num){
        System.out.println("Factorial with taracing of number:- "+num);
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *=i;
            System.out.println("Factorial of ("+i+") with tracing: "+fact);
        }
    }
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        ProgramNo46 obj = new ProgramNo46();
        obj.factorialNumber(num1);
        obj.factorialNumber(num2);
    }    
}