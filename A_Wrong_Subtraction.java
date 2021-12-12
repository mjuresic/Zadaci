import java.util.*;
import java.io.*;

public class A_Wrong_Subtraction {
    public static void main(String[]args){
          Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
          int a = in.nextInt();
          int n = in.nextInt();
          for (int i = 0; i < n; i++){
              if (a%10 == 0){
                 a /= 10;
              }
              else{
                  a--;
              }
          }
          System.out.println(a);
    }
}