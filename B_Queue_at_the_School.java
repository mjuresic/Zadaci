import java.util.Scanner;

public class B_Queue_at_the_School {
    public static void main(String ae[]) {
        Scanner sb = new Scanner(System.in);
        String p = sb.nextLine();
        String q[] = p.split(" ");
        int n = Integer.parseInt(q[0]);
        int t = Integer.parseInt(q[1]);
        String r = sb.nextLine();
        int z = r.length();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < (z - 1); j++) {
                if ((r.charAt(j) == 'B') && (r.charAt(j + 1) == 'G')) {

                    char[] myNameChars = r.toCharArray();
                    myNameChars[j] = 'G';
                    myNameChars[j + 1] = 'B';
                    r = String.valueOf(myNameChars);
                    j++;
                }
            }
        }
        System.out.println(r);
    }
}