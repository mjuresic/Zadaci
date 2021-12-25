import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

////////////////////////////////
        // NOT WORKING  //
////////////////////////////////
public class B_And_It_s_Non_Zero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
        int a = 0;
        int b = 200000;
        Integer[] polje = Collections.nCopies(20, b-a+1).toArray(new Integer[0]);
        for(int num=a;num<=b;num++){
            int num2=num;
            for (int k = 0; num2 != 0; k++, num2 >>>= 1) {
                if ((num2 & 1) != 0) polje[k]=polje[k]-1;
              }
        }

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
        for(int i=0;i<t;i++){

            a = sc.nextInt();
            b = sc.nextInt();

            //for(int m=0;m<polje.length;m++){
            //    System.out.print(b-a+1-polje[m]);
           // }
            int min = Collections.min(Arrays.asList(polje));
            System.out.println(min);
        }
        
	}	
}
