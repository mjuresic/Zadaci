import java.util.Arrays;
import java.util.Scanner;

public class A_Ancient_Civilization
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		for(int i=0; i<t; i++){
            int n=scanner.nextInt();
            int l=scanner.nextInt();
            int[] result=new int[l];
            Arrays.fill(result, 0);
            int max=-1;
            int najveci=-1;
            for(int j=0; j<n; j++){
                Integer x=scanner.nextInt();
                String temp=Integer.toBinaryString(x);
                //System.out.println(x+" "+temp);
                if(temp.length()>najveci){
                    najveci=temp.length();
                }
                int razlika=l-temp.length();
                max=-1;
                for(int k=temp.length()-1; k>=0; k--){
                    if(temp.charAt(k)=='1'){
                            result[k+razlika]=result[k+razlika]+1;
                    }
                    if(result[k+razlika]>max)
                        max=result[k+razlika];
                }
                //System.out.println(Arrays.toString(result)+" k="+max);
            }
            int decimal = 0;
            int power = 0;
            for(int k = l-1 ; k >= 0; k--){
                //System.out.println(k);
                if(result[k]>n/2){
                    decimal += Math.pow(2, power);
                }
                power++;
            }
            System.out.println(decimal);
        }
	}
}