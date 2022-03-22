// #samoJako
import java.util.Arrays;
import java.util.Scanner;

public class A_Integer_Moves {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
            Integer x=sc.nextInt();
            Integer y=sc.nextInt();
            System.out.println(solve(x,y));
        }
		sc.close();
	}

	static Integer solve(Integer x, Integer y) {
        if(x==0 && y==0) return 0;
        if(check(x,y,0,0)== true) return 1;
        else return 2;
	}

    static boolean check(Integer x, Integer y, Integer x2, Integer y2){
        Double korijen = Math.sqrt( square(x2-x)+square(y2-y));
        if(  korijen == korijen.intValue() )
            return true;
        else return false;

    }

	static long square(int x) {
		return (long) x * x;
	}
}
