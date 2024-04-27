// 84.WAP TO CALCULATE SUM OF ODD ELEMENTS IN AN ARRAY.

import java.util.Scanner;

public class ProgramNo84 {
    public void oddSum(int[] arr, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0)
                sum += arr[i];
        }
        System.out.print("Sum of the add elements of array: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        ProgramNo84 obj = new ProgramNo84();
        obj.oddSum(arr, n);
        sc.close();
    }
}
