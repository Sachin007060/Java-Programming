// 42.WRITE TRACING FOR PERFECT NO 28 AND 6.

public class ProgramNo42 {
    public static void main(String[] args) {
        System.out.print("Tracing of the perfect number 6: ");
        for(int i=1; i<6; i++){
            if(6%i == 0){
                int sum = 0;
                sum += i;
                System.out.print(sum+" ");
            }
        }
        System.out.println();
        System.out.print("Tracing of the perfect number 28: ");
        for(int i= 1; i<28; i++){
            if(28%i == 0){
                int sum = 0;
                sum += i;
                System.out.print(sum+ " ");
            }
        }
    }
}
