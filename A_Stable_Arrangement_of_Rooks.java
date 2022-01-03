import java.util.Scanner;
public class A_Stable_Arrangement_of_Rooks
{
   public static void main(String args[])
   {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for(int i = 0;i<n;i++){
        double m = scan.nextDouble();
        int k = scan.nextInt();
        double djeljeno = (double)(m/2);
        //System.out.println(m + " " + k + " "+Math.ceil(djeljeno));
        if( k > Math.ceil(djeljeno)){
            System.out.println("-1");
            continue;
        } else {
            if(m==1 && k==1) {
                System.out.println("R");
                continue;
            }
            int brojac=k;
            for(int j = 1;j<=m;j++){
                for(int kk = 1;kk<=m;kk++){
                    if(j%2!=0 && kk%2!=0 && j==kk && brojac>0) {
                        System.out.print("R");
                        brojac--;
                    } else
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }
   }
}