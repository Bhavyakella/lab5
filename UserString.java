
/*Bhavya kellla
 Programming fundamentals
 Summer
 LAB 5
 Exercise #2
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserString {

	public static void main(String[] args) throws IOException {

		String a = "";

		String file = "userStrings.txt";

		Scanner sc = new Scanner(System.in);

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter Pw = new PrintWriter(bw);

		while (!a.equalsIgnoreCase("DONE")) {
			System.out.print("Please enter your string: ");
			System.out.println("");
			a = sc.nextLine();

			if (a.equalsIgnoreCase("done")) {
				Pw.close();
			}

			Pw.print(a);
		}

	}
}
