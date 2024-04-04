public class ProgramNo30 {
    public static void main(String[] args) {
        for(int i=10; i<200; i++){
            int number = i;
            int temp  = number;
            int rev = 0;
            while (number>0) {
                int rem=0;
                rem = number%10;
                rev = (rev*10)+rem;
                number/=10;
            }
                if(rev == temp)
                    System.out.print(temp+" ");
        }
    }
}
