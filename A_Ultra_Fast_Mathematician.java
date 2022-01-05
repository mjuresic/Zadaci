
import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Ultra_Fast_Mathematician
{
    static String  xoring(String a, String b, int n){
        String ans = "";
        for (int i = 0; i < n; i++)
        {
            if (a.charAt(i) == b.charAt(i))
                ans += "0";
            else
                ans += "1";
        }
        return ans;
        }

	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
	    String a = sc.next();
        String b = sc.next();
		System.out.println(xoring(a,b,a.length()));
	}	
}