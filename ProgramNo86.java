// 86.DESIGN A METHOD TO CREATE AN ARRAY AND READ ARRAYELEMENTS FROM THE USER AND RETURN IT.->IN CLASS

import java.util.Scanner;

public class ProgramNo86 {
    public static void getElements(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        System.out.print("All the array elements are: ");
        getElements(arr);
        sc.close();
    }   
}
