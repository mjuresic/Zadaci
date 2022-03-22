// #samoJako
import java.util.Arrays;
import java.util.Scanner;

public class B_XY_Sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
            Integer n=sc.nextInt();
            Integer B=sc.nextInt();
            Integer x=sc.nextInt();
            Integer y=sc.nextInt();
            System.out.println(solve(n,B,x,y));
        }
		sc.close();
	}

	static Long solve(Integer n, Integer B, Integer x, Integer y) {
        Long suma = 0L;
        Long prethodni = 0L;
        for(int i=0;i<n;i++){
            Long rjesenje1 = prethodni + x;
            Long rjesenje2 = prethodni - y;
            Long veci = Long.max(rjesenje1,rjesenje2);
            Long manji = Long.min(rjesenje1,rjesenje2);
            if(veci<=B ){
                prethodni = veci;
                suma = suma + veci;
            } else if(manji<=B){
                prethodni = manji;
                suma = suma+manji;
            }
        }
        return suma;
	}

}
