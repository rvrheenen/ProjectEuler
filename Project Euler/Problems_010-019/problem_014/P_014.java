package problem_014;

import java.io.PrintStream;
import java.util.Scanner;

//@Problem: Longest Collatz Sequence
//The following iterative sequence is defined for the set of positive integers:
//
//n -> n/2 (n is even)
//n -> 3n + 1 (n is odd)
//
//Using the rule above and starting with 13, we generate the following sequence:
//13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
//
//It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//Which starting number, under one million, produces the longest chain?
//
//NOTE: Once the chain starts the terms are allowed to go above one million.

public class P_014 {

	public static final double LIMIT = 1000000;

	public P_014() {
		out = new PrintStream(System.out);
	}

	PrintStream out;
	Scanner in;

	void start() {
		in = new Scanner(System.in);
		out.printf("Enter limit to find highest collatz chain for: ");
		double limit = in.nextDouble();
		if (limit <= 0) {
			limit = LIMIT;
		}

		double highest = 0;
		double highesti = 0;
		for (double i = 1; i <= limit; i++) {
			double cc = count_chain(i);
			if (cc > highest) {
				highest = cc;
				highesti = i;
			}
		}
		out.printf("The number below %.0f with the longest chain was %.0f, with a chainlength of %.0f", limit, highesti, highest);
		
	}

	double count_chain(double num) {
		double count = 1;
		while (num > 1) {
			if (num % 02 == 0) {
				num /= 2;
			} else {
				num = (num * 3) + 1;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		new P_014().start();
	}

}
