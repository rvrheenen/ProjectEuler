package problem_006;

import java.io.PrintStream;
//import java.util.Scanner;

//@Problem:

//The sum of the squares of the first ten natural numbers is,
//1^2 + 2^2 + ... + 10^2 = 385
//
//The square of the sum of the first ten natural numbers is,
//(1 + 2 + ... + 10)^2 = 55^2 = 3025
//
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class P_006 {
	public static final int LIMIT = 100;

	public P_006() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
//		Scanner in = new Scanner(System.in);
//		int limit = in.nextInt();
		
		int sum_of_sq = 0;
		int sq_of_sum = 0;
		int difference = 0;

		for (int i = 1; i <= LIMIT; i++) {
			sum_of_sq += i * i;
		}

		for (int i = 1; i <= LIMIT; i++) {
			sq_of_sum += i;
		}

		sq_of_sum *= sq_of_sum;

		difference = sq_of_sum - sum_of_sq;
		out.printf("%d", difference);
		out.printf("%n%n%d - %d = %d", sq_of_sum, sum_of_sq, difference);

	}

	public static void main(String[] args) {
		new P_006().start();
	}

}
