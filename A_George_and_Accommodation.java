import java.util.*;
import java.lang.*;
import java.io.*;

public class A_George_and_Accommodation
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int result=0;
	    for(int i=0;i<n;i++){
	        int j=sc.nextInt();
	        int k=sc.nextInt();
	        if((k-j)>=2)
	            result++;
	    }
	    System.out.println(result);
	}
}