
import java.util.Scanner;
public class A_Construct_a_Rectangle 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int i=0;i<t;i++){
            int l1 = ip.nextInt();
            int l2 = ip.nextInt();
            int l3 = ip.nextInt();
        
            if(l1==l2){
                if(l3%2==0){
                    System.out.println("YES");
                    continue;
                }
            }
            if(l1==l3){
                if(l2%2==0){
                    System.out.println("YES");
                    continue;
                }
            }
            if(l2==l3){
                if(l1%2==0){
                    System.out.println("YES");
                    continue;
                }
            }
            //if ((l1 + l2 + l3) % 4 == 0) {
            //    System.out.println("YES");
            //    continue;
            //}
            if(l1+l2==l3 || l2+l3==l1 || l3+l1==l2){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
        
    }
}