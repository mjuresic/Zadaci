
import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Drinks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double suma=0;
        for(int i=0;i<n;i++){
            int br=sc.nextInt();
            suma=suma+br;
        }
        System.out.println(suma/n);
	}	
}