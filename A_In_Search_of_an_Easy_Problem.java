
import java.util.Scanner;
public class A_In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean flag = false;
        for(int i = 0;i<n;i++){
            int temp = scan.nextInt();
            if(temp == 1){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("HARD");
        }
        else System.out.println("EASY");

    }
}