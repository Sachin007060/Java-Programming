public class ProgramNo16 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=35; i>=11; i--){
            if(i%2!=0)
                sum+=i;
        }
        System.out.println("Sum of the odd numbers between 35 to 11 = "+sum);
    }
}
