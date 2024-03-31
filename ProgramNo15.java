public class ProgramNo15 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=20; i>=10; i--){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of the even numbers between 20 to 10 = "+sum);
    }
}
