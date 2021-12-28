
import java.util.Scanner;
public class A_Robot_Cleaner 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int i=0;i<t;i++){
            int n = ip.nextInt();
            int m = ip.nextInt();
            int rr = ip.nextInt();
            int rc = ip.nextInt();
            int dr = ip.nextInt();
            int dc = ip.nextInt();
            int pozX=rr,pozY=rc;
            int pomakX=1,pomakY=1;
            int brojac=0;
            while(true){
                if(pozX==dr || pozY==dc)
                    break;
                if(pozX==0)
                    pomakX=1;
                if(pozX>=n)
                    pomakX=-1;

                if(pozY==0)
                    pomakY=1;
                if(pozY>=m)
                    pomakY=-1;
                
                pozX=pozX+pomakX;
                pozY=pozY+pomakY;
                brojac++;
            }
            
            System.out.println(brojac);
        }
        
    }
}