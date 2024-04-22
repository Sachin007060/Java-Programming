// 79 .WAP TO PRINT ARRAY ELEMENTS IN REVERSE ORDER.->IN CLASS

import java.util.Scanner;

public class ProgramNo79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("+++++++++++++++++++++++++");
        System.out.print("Elements are in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" \n+++++++++++++++++++++++++ ");
        int len = arr.length - 1;
        int temp;
        for (int i = 0; i < n; i++) {
            if (i < len) {
                temp = arr[i];
                arr[i] = arr[len];
                arr[len] = temp;
            }
            len--;
        }
        System.out.print("Array elements in reverse order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}