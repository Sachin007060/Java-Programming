public class ProgramNo13 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++){
            if(i%2==0){
                sum+=i;
                System.out.println("Adding "+i+" to the sum ");
            }
        }
        System.out.println("Sum of even numbers between 1 to 10 = "+sum);
    }
}
