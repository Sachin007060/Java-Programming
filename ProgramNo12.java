public class ProgramNo12 {
    int  sumOfNumbers(int i, int sum){
        for(; i<=5; i++){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        ProgramNo12 obj = new ProgramNo12();
        System.out.print("Sum of the numbe (1 to 5):- "+obj.sumOfNumbers(1,0));
    }
}
