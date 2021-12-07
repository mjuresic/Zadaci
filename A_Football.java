import java.util.Scanner;
public class A_Football 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        if(s.contains("1111111")||s.contains("0000000"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}