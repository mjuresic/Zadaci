// #samoJako
import java.util.Scanner;
import java.util.*;
import java.io.*;
 

public class C_Bracket_Sequence_Deletion {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
	
    static StringBuilder txt = new StringBuilder();
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long t = sc.nextLong();
		for(int i = 0; i < t; i++) {
            Long n=sc.nextLong();
            String zagrade=sc.next();
            txt.setLength(0);
            txt.append(zagrade);
            solve(n);
        }
		sc.close();
	}

    static void solve(Long n){
        Integer rjesenje = 0;
        Integer i=1;
        Integer offset = 0;
        while(offset<txt.length()){
            //if(i>txt.length()) { i--; continue;}
            if((offset+i)>txt.length()) {break;}
            String podstring = txt.substring(offset,offset+i);

            if(podstring.equals(")(")){
                //System.out.println("dve zagrade");
                Integer indeks = txt.indexOf(")", offset+i);
                //System.out.println(indeks);
                if(indeks>0) {
                    podstring=txt.substring(offset,indeks+1);
                    //System.out.println(podstring);
                    offset=offset+podstring.length();
                    rjesenje=rjesenje+1;
                    i=0;
                    continue;
                } 
            }
            if(podstring.length()>1 && podstring.charAt(0) == podstring.charAt(podstring.length()-1) && isPalindrome(podstring)==true) {
                //System.out.println("palindrom");
                offset=offset+podstring.length();
                rjesenje=rjesenje+1;
                i=0;
                continue;
            } else if(valid_paren(podstring)==true){
                //System.out.println("validacija");
                offset=offset+podstring.length();
                rjesenje=rjesenje+1;
                i=0;
                continue;
            }
            i++;
        }
        Integer razlika = txt.length()-offset;
        if(razlika<0) razlika=0;
        System.out.println(rjesenje+ " "+ razlika);
    }

    static boolean isPalindrome(String str)
    {
        if(str.length()<2) return false;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
             i++;
            j--;
        }
        return true;
    }

    public static boolean valid_paren(String input_str) {
        if(input_str.length()<2) return false;
        Stack<Character> s = new Stack<Character>();
        for(int i = 0, n = input_str.length();  i < n ; i++) { 
            char st = input_str.charAt(i); 
          if (st == '(') {
            s.push(st);
          }
          else {
              if(s.empty()) {
                return false;
              }
              else{
              char top = (Character) s.peek();
              if(st == ')'){
                s.pop();
              }
              else{
                return false;
              }
            }
          }
        }
        if(s.empty()) {
          return true;
        }
        else{
          return false;
        }
      }
}
