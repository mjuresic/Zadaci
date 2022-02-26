import java.util.Scanner;

public class A_Hit_the_Lottery {
	static final int[] DENOMINATIONS = { 100, 20, 10, 5, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(solve(n));

		sc.close();
	}

	static int solve(int n) {
		int result = 0;
		for (int denomination : DENOMINATIONS) {
			result += n / denomination;

			n %= denomination;
		}
		return result;
	}
}
