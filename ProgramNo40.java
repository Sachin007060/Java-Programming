// 40.WAP TO CALCULATE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 AND NO SHOULD BE DIVISIBLE BY ONLY 11.

public class ProgramNo40 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=20; i<=60; i++){
            if(i%11==0){
                sum+=i;
            }
        }
        System.out.print("Sum of all the number present in 20 and 60 divisible by 11 only: "+sum);
    }
}