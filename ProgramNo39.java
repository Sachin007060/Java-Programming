// 39.WAP TO PRINT THE NO B/W 1 TO 20 WHICH IS DIVISIBLE BY 2 AND 4.

public class ProgramNo39 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if(i%2==0 && i%4==0){
                System.out.print(i+" ");
            }
        }
    }
}
