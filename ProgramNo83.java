// 83.WAP TO CALCULATE SUM OF EVEN ELEMENTS IN AN ARRAY.

import java.util.Scanner;

public class ProgramNo83 {
    public void evenSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        ProgramNo83 obj = new ProgramNo83();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Total sum of array elements are: ");
        obj.evenSum(arr, n);
        sc.close();
    }
}
