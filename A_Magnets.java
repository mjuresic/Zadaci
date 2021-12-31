import java.io.*;
import java.math.*;
import java.util.*;

//Codeforces
public class A_Magnets {
 private static Scanner in;
 private static PrintStream out;
 private static boolean LOCAL_TEST = false;

 private static void solve() throws IOException
 {
  int n = in.nextInt();
  int grp = 1;
  String prev = in.next();
  for (int i = 1; i < n; i++) {
   String s = in.next();
   if (!s.equals(prev))
    grp++;
   prev = s;
  }
  out.println(grp);
 }

 public static void main(String[] args) throws IOException 
 {
  solve();
 }
}