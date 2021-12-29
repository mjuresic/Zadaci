
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class A_Integer_Diversity 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int i=0;i<t;i++){
            int n = ip.nextInt();
            List<Integer> iskoristeno = new ArrayList<Integer>(n);
            int brojac = 0;
            for(int j=0;j<n;j++){
                int br = ip.nextInt();
                if(iskoristeno.contains(br)) {
                    int negativno = br*-1;
                    if(iskoristeno.contains(negativno)) continue;    
                    else {
                        iskoristeno.add(negativno);
                        brojac++;
                    }
                } else {
                    iskoristeno.add(br);
                        brojac++;
                }
            }
            System.out.println(brojac);
        }
        
    }
}