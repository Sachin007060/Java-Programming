import java.util.Scanner;

public class RToLPrintEachDigit {
    public static int pow(int n, int count){
        int pow=1;
        while (count>0) {
            pow *= 10;
            count--;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int temp = n, count=0;
        while (temp>0) {
            count++;
            temp/=10;
        }
        int total_count= count-1;
        while (total_count >= 0) {
            int digit = (n/pow(n, total_count))%10;
            System.out.println(digit+" ");
            total_count--;
        }
        sc.close();
    }
}
