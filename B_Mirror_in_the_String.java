     
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;
    import java.util.Scanner;
    public class B_Mirror_in_the_String 
    {
        public static void main(String args[])
        {
            Scanner ip = new Scanner(System.in);
            int t = ip.nextInt();
            for(int i=0;i<t;i++){
                int n = ip.nextInt();
                String rijec = new String();
                rijec = ip.next();
                Character prethodni = rijec.charAt(0);
                int brojac=0;

                if(rijec.length()==1) {
                    System.out.println(rijec+rijec);
                    continue;
                }
                
                for(int j=1;j<rijec.length();j++){
                    if(rijec.charAt(j)<prethodni && j<=1)
                    {
                        prethodni=rijec.charAt(j);
                        brojac++;
                    } else if(rijec.charAt(j)<=prethodni && j>1) 
                    {
                        prethodni=rijec.charAt(j);
                        brojac++;
                    } else {break;}
                }

                System.out.print(rijec.subSequence(0, brojac+1));
                for(int ii=brojac;ii>=0;ii--)
                    System.out.print(rijec.charAt(ii));
                System.out.println();
            }
            
        }
    }