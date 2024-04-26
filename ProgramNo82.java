// 82.WAP TO PRINT ODD ELEMENTS IN AN ARRAY.

import java.util.Scanner;

public class ProgramNo82{ 
    public void oddEle(int []arr, int n) {
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0)
                System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Odd elements are: ");
        ProgramNo82 obj = new ProgramNo82();
        obj.oddEle(arr, n);
        sc.close();
    }
}