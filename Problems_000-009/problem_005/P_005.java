package problem_005;

import java.io.PrintStream;

//@Problem:
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class P_005 {

	public static final int DIGITS = 20;

	public P_005() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		int iter = 1;
		while (!check_div(iter)) {
			iter++;
		}
		out.printf("%d", iter);
	}

	boolean check_div(int num) {
		for (int i = 1; i <= DIGITS; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new P_005().start();
	}

}
