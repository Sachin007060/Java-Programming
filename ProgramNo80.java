import java.util.Scanner;

public class ProgramNo80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Even array elements are: ");
        for(int i=0; i<n; i++){
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
