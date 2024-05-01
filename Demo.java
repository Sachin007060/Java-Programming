import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int arm = 0, t = n;
		int cnt = count(n);
		while (n > 0) {
			int rem = n % 10;
			arm = arm + power(rem, cnt);
			n /= 10;
		}
		if (t == arm)
			System.out.println("armstrong");
		else
			System.out.println("not a armstrong");
		sc.close();
	}

	public static int power(int n, int count) {
		int pow = 0;
		for (int i = 1; i <= count; i++) {
			pow *= n;
		}
		return pow;
	}

	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
}