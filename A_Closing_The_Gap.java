import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Closing_The_Gap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int sum=0;
		for(int i=0;i<t;i++){
            int b = sc.nextInt();
            for(int j=0;j<b;j++){
                int a=sc.nextInt();
                sum=sum+a;
            }
            if(sum%b==0) System.out.println("0");
            else System.out.println("1");
            sum=0;
        }
	}	
}
