import java.util.ArrayList;
import java.util.Scanner;

public class A_Is_your_horseshoe_on_the_other_hoof_ {

    public static int diffValues(int[] numArray){
        int numOfDifferentVals = 0;
    
        ArrayList<Integer> diffNum = new ArrayList<>();
    
        for(int i=0; i<numArray.length; i++){
            if(!diffNum.contains(numArray[i])){
                diffNum.add(numArray[i]);
            }
        }
    
        if(diffNum.size()==1){
                numOfDifferentVals = 1;
        }
        else{
              numOfDifferentVals = diffNum.size();
            } 
    
       return numOfDifferentVals;
    }
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int[] polje=new int[4];
        polje[0]=myscanner.nextInt();
        polje[1]=myscanner.nextInt();
        polje[2]=myscanner.nextInt();
        polje[3]=myscanner.nextInt();
        
        System.out.println(4-diffValues(polje));
        
    }
}
