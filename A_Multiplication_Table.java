import java.util.Scanner;
public class A_Multiplication_Table {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long rowsCols = scan.nextLong();
        long target = scan.nextLong();
        int cnt = 0;
        for (int i = 1; i <= rowsCols; i++) {
            if (target % i == 0 && target <= i * rowsCols) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
