import java.util.Scanner;

public class A_Good_ol_Numbers_Coloring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(solve(a, b));
		}

		sc.close();
	}

	static String solve(int a, int b) {
		return gcd(a, b) == 1 ? "Finite" : "Infinite";
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}
