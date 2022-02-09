import java.util.Scanner;

public class A_Buy_a_Shovel {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int r = scan.nextInt();
        int shovels = 0;
        for (int i = 1;; i++) {
            if (k * i % 10 == 0 || k * i % 10 == r) {
                shovels = i;
                break;
            }
        }
        System.out.println(shovels);
    }
}
