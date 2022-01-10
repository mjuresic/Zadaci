import java.util.Scanner;

public class A_Plus_One_on_the_Subset {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        int t = myscanner.nextInt();

        for (int i = 1; i <= t; i++) {
           int n=myscanner.nextInt();
           int max=0;
           int min=1000000001;
           for(int j = 1; j <= n; j++) {
               int br=myscanner.nextInt();
               if(br<min)
                    min=br;
                if(br>max)
                    max=br;
           }
           System.out.println(max-min);
        }
    }
}
