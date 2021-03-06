import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        String text = scan.nextLine().toLowerCase();
        Set<Integer> alphabetsCheck = new HashSet<>(26);
        int counter = 0;
        for (char c : text.toCharArray()) {
            int value = c - 'a';
            if (alphabetsCheck.add(value)) {
                counter++;
            }
            if (counter == 26) {
                break;
            }
        }
        if (counter==26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
