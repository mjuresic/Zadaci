
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class B_Different_is_Good {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) throws IOException {
		in.readLine();
		String s = in.readLine();
		if (s.length() > 26) {
			out.print(-1);
		} else {
			int repetitions = 0;
			List<Character> abc = new ArrayList<>();
			char[] letters = s.toCharArray();
			for (char letter : letters) {
				if (abc.contains(letter)) {
					repetitions++;
				} else {
					abc.add(letter);
				}
			}
			out.print(repetitions);
		}
		out.close();
	}
}
