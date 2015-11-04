package problem_021;

import java.io.PrintStream;
//@Problem: Amicable numbers
//Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
//If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.
//
//For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
//
//Evaluate the sum of all the amicable numbers under 10000.

public class P_021 {
	public static final double LIMIT = 10000;

	public P_021() {
		out = System.out;
	}

	PrintStream out;

	void start() {
		double count = 0;
		for (double i = 1; i <= LIMIT; i++) {
			double tmp = sum_factors(i);
			if (tmp != i && sum_factors(tmp) == i) {
				count += i;
			}
		}
		out.printf("%.0f", count);
	}

	double sum_factors(double num) {
		double count = -num;
		double sqrt = Math.sqrt(num);
		for (double i = 1; i <= sqrt; i++) {
			if (i * i == num) {
				count += i;
			} else if (num % i == 0) {
				count += (i + (num / i));
			}
		}

		return count;
	}

	public static void main(String[] args) {
		new P_021().start();
	}

}
