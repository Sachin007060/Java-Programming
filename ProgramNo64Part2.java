// 65(part 2). GENERATE FIBONACCI SERIES UPTO 50.

public class ProgramNo64Part2 {
    public static void main(String[] args) {
        long first = 0;
        long second = 1;
        System.out.print(first+" "+second);
        for(int i=2; i<50; i++){
            long third = first + second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }
    }
}