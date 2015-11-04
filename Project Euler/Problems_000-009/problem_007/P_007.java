package problem_007;

import java.io.PrintStream;
import java.util.Scanner;

//@Problem:

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

public class P_007 {

	public static final int LIMIT = 10001;

	public P_007() {
		out = new PrintStream(System.out);
	}

	PrintStream out;
	Scanner in;

	void start() {
		out.printf("Enter input: ");
		in = new Scanner(System.in);
		int limit = in.nextInt();
		
		if (limit <= 0){
			limit = LIMIT;
		}
		
		int amount = 0;
		int iter = 1;

		while (amount < limit) {
			iter++;
			if (check_prime(iter)) {
				amount++;
			}
		}
		out.printf("%d", iter);

	}

	boolean check_prime(double num) {
		// Returns true if prime number
		if (num == 2) {
			return true;
		} else if (num % 2 == 0) {
			return false;
		} else if (num == 1) {
			return false;
		}
		double sqrt = Math.sqrt(num);
		for (double i = 3; i <= (sqrt); i+=2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new P_007().start();
	}

}
