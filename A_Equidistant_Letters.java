import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A_Equidistant_Letters
{
    public static void main(String hi[]) throws Exception
    {
        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(infile.readLine());
        int T = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(T-->0)
        {
            char[] arr = infile.readLine().trim().toCharArray();
            int N = arr.length;
            int[] freq = new int[26];
            for(char c: arr)
                freq[c-'a']++;
            String res = "";
            for(int i=0; i < 26; i++)
                if(freq[i] == 2)
                    res += (char)(i+'a');
            res += res;
            for(int i=0; i < 26; i++)
                if(freq[i] == 1)
                    res += (char)(i+'a');
            sb.append(res+"\n");
        }
        System.out.print(sb);
    }
    public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception
    {
        int[] arr = new int[N];
        st = new StringTokenizer(infile.readLine());
        for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }
}