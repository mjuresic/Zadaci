
import java.util.Scanner;
public class A_HQ9_ 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        if(s.contains("H")||s.contains("Q")||s.contains("9"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}