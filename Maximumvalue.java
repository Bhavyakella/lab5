
/*Bhavya kellla
 Programming fundamentals
 Summer
 LAB 5
 Exercise #1
 */
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class Maximumvalue {

	public static void main(String args[]) throws FileNotFoundException {

		Scanner input = new Scanner(new File("input.csv"));
		String num = "";
		String[] array = null;
		int max = 0, row = 1;
		System.out.println("Maximum values");

		while (input.hasNext())

		{

			num = input.nextLine();

			array = num.split(",");

			max = 0;

			for (int i = 0; i < array.length; i++)

			{

				if (Integer.parseInt(array[i]) > max)

					max = Integer.parseInt(array[i]);

			}

			System.out.println("ROW " + row + " : " + max);

			row++;

		}

	}

}
