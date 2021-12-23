import java.util.Scanner;

public class A_Vanya_and_Fence
{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int t=z.nextInt();
        int sum=0;

        for(int i=0;i<n;i++){
            int br=z.nextInt();
            if(br>t)
                sum++;
            sum++;
        }
        System.out.println(sum);
    }
}