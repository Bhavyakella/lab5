/*Bhavya kellla
 Programming fundamentals
 Summer
 LAB 5
 Exercise #3
 */

import java.util.Scanner;

public class DivisorCalc {
	public static int gcd(int a, int b) {
		if (b != 0)
			return gcd(b, a % b);
		else
			return a;
	}

	public static void main(String args[]) {
		int val1, val2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first value: ");
		val1 = sc.nextInt();
		System.out.print("Enter second value: ");
		val2 = sc.nextInt();
		System.out.println("GCD = " + gcd(val1, val2));
	}
}
