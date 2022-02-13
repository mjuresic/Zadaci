
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A_Password_Check {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		String password = in.readLine();
		boolean isStrength = password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{5,}");
		out.print(isStrength ? "Correct" : "Too weak");
		out.close();
	}

}
