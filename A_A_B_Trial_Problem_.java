import java.util.Scanner;

public class A_A_B_Trial_Problem_ {
	
	static Scanner sr = new Scanner(System.in);
	public static void main(String args[])
	{
		int t = sr.nextInt();
		
		for(int i = 0; i < t; i++)
		{
			int a = sr.nextInt();
            int b = sr.nextInt();
			System.out.println(a+b);
		}
	}


}