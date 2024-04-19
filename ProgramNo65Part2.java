// 65(part 2). WAP TO PRINT ARMSTRONG NO IN 1 TO 1000.

public class ProgramNo65Part2 {
    int armstrongNo(int num){
        int sum = 0;
        while (num > 0) {
            int rem=0;
            rem = num % 10;
            sum += (rem * rem * rem);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        ProgramNo65Part2 obj = new ProgramNo65Part2();
        for(int i=1; i<=1000; i++){
            if (obj.armstrongNo(i) == i)
                System.out.print(i+ " ");
        }
    }
}