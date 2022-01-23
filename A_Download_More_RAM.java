import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 
public class A_Download_More_RAM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lines = s.nextInt();
 
        s.nextLine();
 
        for (int i = 0; i < lines; i += 1) {
            solve(s.nextInt(), s.nextInt(), s);
        }
    }
 
 
    public static void solve(int n, int k, Scanner s) {
        int[][] rams = new int[n][2];
        for (int i = 0; i < n; i++) {
            rams[i][0] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rams[i][1] = s.nextInt();
        }
 
        Arrays.sort(rams, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
 
        for (int[] e: rams) {
            if (e[0] <= k) k += e[1];
        }
 
        System.out.println(k);
    }
}