package problem_010;

import java.io.PrintStream;

//@Problem:
//	The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//	Find the sum of all the primes below two million.

public class P_010 {

	public static final int LIMIT = 2000000;

	public P_010() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		double sum = 2;

		for (int i = 3; i <= LIMIT; i++) {
			if (check_prime(i)) {
				sum += i;
			}
		}
		out.printf("%.0f", sum);
	}

	boolean check_prime(double num) {
		// Returns true if prime number
		if (num % 2 == 0) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		if (num == 1) {
			return false;
		}
		double sqrt = Math.sqrt(num);
		for (double i = 3; i <= sqrt; i+=2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new P_010().start();
	}

}
