//  36.WAP TO PRINT DIVISORS OF 10.->IN CLASS

public class ProgramNo36{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(10%i==0){
                System.out.print(i+" ");
            }
        }
    }
}