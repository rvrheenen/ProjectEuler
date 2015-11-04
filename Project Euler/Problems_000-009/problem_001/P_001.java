package problem_001;

//@Problem:
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

import java.io.PrintStream;
import java.util.Scanner;

public class P_001 {

	//public static final int RANGE = 1000;

	P_001() {
		out = new PrintStream(System.out);
	}

	PrintStream out;
	Scanner in;

	void start() {
		in = new Scanner(System.in);
		int range = in.nextInt();
		int sum = 0;
		
		for (int i = 0; i < range; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		out.printf("%d", sum);
	}

	public static void main(String[] args) {
		new P_001().start();
	}
}
