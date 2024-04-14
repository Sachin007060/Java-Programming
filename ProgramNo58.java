// 58.WAP TO PRINT THE ****STRONG NUMBER**** B/W 1 TO 1000

public class ProgramNo58 {
    int factorialOfDigit(int rem){
        int fact = 1;
        for(int i=1; i<=rem; i++){
            fact *= i;
        }
        return fact;
    }

    int strongNumber(int num){
        int sum = 0;
        while (num>0) {
            int rem = 0;
            rem = num%10;
            sum += factorialOfDigit(rem);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        ProgramNo58 obj = new ProgramNo58();
        System.out.println("Strong number between (1 to 1000) :"); 
        for(int i=1; i<1000; i++){
            int temp = i;
            if(temp == obj.strongNumber(i)){
                System.out.print(temp+"  ");
            }
        }
    }
}