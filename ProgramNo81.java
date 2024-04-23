
import java.util.Scanner;

public class ProgramNo81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
           sum += arr[i];
        }
        System.out.print("The sum of all the elements is: "+sum);
        sc.close();
    }
}
