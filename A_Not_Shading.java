import java.util.*;

public class A_Not_Shading {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int r=sc.nextInt();
            int c=sc.nextInt();
            int rezultat = -1;
            int brojac = 0;
            for(int i=0;i<m;i++){
                String str=sc.next();
                //System.out.println(str);
                for(int j=0;j<n;j++){
                    //System.out.println(i+" "+j+" "+str.charAt(j));
                    if(str.charAt(j)=='B'){
                        brojac++;
                        //System.out.println(i+" "+j);
            
                        if(i==r-1 && j==c-1){
                            rezultat=0;
                        }
                        if(i==r-1 || j==c-1){
                            if(rezultat!=0)
                                rezultat=1; 
                        }
                    }
                }
            }
            if(brojac>0 &&  rezultat==-1){
                rezultat=2;
            }
            System.out.println(rezultat);

        }
    }
}