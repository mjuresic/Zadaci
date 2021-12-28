
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B_Game_on_Ranges 
{
    public static <T extends Comparable<T>> void concurrentSort(
                                        final List<T> key, List<?>... lists){

    List<Integer> indices = new ArrayList<Integer>();
    for(int i = 0; i < key.size(); i++)
        indices.add(i);

    Collections.sort(indices, new Comparator<Integer>(){
        @Override public int compare(Integer i, Integer j) {
            return key.get(i).compareTo(key.get(j));
        }
    });

    Map<Integer,Integer> swapMap = new HashMap<Integer, Integer>(indices.size());
    List<Integer> swapFrom = new ArrayList<Integer>(indices.size()),
                  swapTo   = new ArrayList<Integer>(indices.size());
    for(int i = 0; i < key.size(); i++){
        int k = indices.get(i);
        while(i != k && swapMap.containsKey(k))
            k = swapMap.get(k);

        swapFrom.add(i);
        swapTo.add(k);
        swapMap.put(i, k);
    }

    for(List<?> list : lists)
        for(int i = 0; i < list.size(); i++)
            Collections.swap(list, swapFrom.get(i), swapTo.get(i));
}
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int i=0;i<t;i++){
            int n = ip.nextInt();
            List<Integer> x = new ArrayList<Integer>(n);
            List<Integer> y = new ArrayList<Integer>(n);
            List<Integer> razlika = new ArrayList<Integer>(n);
            int[] rezultat = new int[n];
            List<Integer> pozicija = new ArrayList<Integer>(n);
            ArrayList<Integer> iskoristeno = new ArrayList<Integer>();
            
            for(int j=0;j<n;j++){
                int l=ip.nextInt();
                int r=ip.nextInt();
                x.add(l);
                y.add(r);
                pozicija.add(j);
                razlika.add(Math.abs(l-r));
            }
            List<Integer> xx = new ArrayList<>(x);
            List<Integer> yy = new ArrayList<>(y);
            concurrentSort(razlika, pozicija, x, y, razlika);
  
            for(int m=0; m<razlika.size(); m++){
                if(razlika.get(m)==0){
                    rezultat[pozicija.get(m)] = x.get(m);
                    iskoristeno.add(x.get(m));
                }
                for(int g=y.get(m);g>=x.get(m);g--){
                    if(iskoristeno.contains(g)) continue;
                    else {
                        rezultat[pozicija.get(m)] = g;
                        iskoristeno.add(g);
                    }
                }
                //System.out.println(razlika.get(m));
                
            }

            for(int ii=0; ii<n; ii++){
                System.out.println(xx.get(ii)+" "+yy.get(ii)+" "+ rezultat[ii]+" ");
            }
            System.out.println("");
        }
        
    }
}