// 38.WAP TO PRINT THE NO B/W 1 TO 100 WHICH IS DIVISIBLE BY ONLY 9.

public class ProgramNo38 {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i%9==0){
                System.out.print(i+" ");
            }
        }
    }
}
