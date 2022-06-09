import java.util.Arrays;
import java.util.Scanner;

public class B_Assigning_to_Classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int[] a = new int[2 * n];
            for (int i = 0; i < a.length; ++i) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(a));
        }

        sc.close();
    }

    static int solve(int[] a) {
        int[] sorted = Arrays.stream(a).boxed().sorted().mapToInt(x -> x).toArray();

        return sorted[a.length / 2] - sorted[a.length / 2 - 1];
    }
}