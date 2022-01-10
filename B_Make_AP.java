import java.util.Scanner;
import java.util.*;

public class B_Make_AP {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int t = myscanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int a=myscanner.nextInt();
            int b=myscanner.nextInt();
            int c=myscanner.nextInt();
            int d;
            
            // first and second
            d=b-a;
            // 100 200 1
            // 2 1 1
            if((b+d)%c==0 && (b+d)>0){
                //System.out.print(a+" "+b+" "+c+" "+d + " "+0%c);
                System.out.println("YES");
                continue;
            }

            // second and third
            d=c-b;
            // 1 200 300
            if((b-d)%a==0 && (b-d)>0 ){
                System.out.println("YES");
                continue;
            }

            // first and third       
            // 1 200 300
            if((c-a)%2==0){
                d=(c-a)/2;    
                if((a+d)%b==0 && (a+d)>0){
                    System.out.println("YES");
                    continue;
                }    
            }
            System.out.println("NO");
        }
    }
}
