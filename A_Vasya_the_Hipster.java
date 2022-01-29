import java.util.Scanner;
 
public class A_Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int broj = Math.min(a,b);
        if(a>b){
            System.out.print(broj+" "+(a-b)/2);
        }
        else{
            System.out.print(broj+" "+(b-a)/2);
        }
    }
}
