import java.util.*;
import java.io.*;
import java.awt.*;

public class A_Divisibility_Problem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a%b==0){
                System.out.println("0");
            } else {
                int c=(int)(a%b);
                System.out.println(b-c);
            }
        }
    }
}