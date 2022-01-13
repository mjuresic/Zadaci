import java.util.*;
import java.io.*;
import java.awt.*;

public class A_Short_Substrings {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        while(t-->0){
            char[] c=sc.next().toCharArray();
            sb.append(c[0]);
            for(int i=1;i<c.length;i+=2)sb.append(c[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}