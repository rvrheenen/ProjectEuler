package problem_003;

import java.io.PrintStream;
//import java.util.Scanner;

//@Problem:
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

// 21: 3,7
// 20: 1 2 5 
// 36: 1, 2, 3, 4, 6, 9, 12, 18
// 27: 1, 3, 9, 27
//

public class P_003 {
	public static final double INPUT = 600851475143.00;

	public P_003() {
		out = new PrintStream(System.out);
	}

	PrintStream out;
	
	void startT() {
		long startTime = System.currentTimeMillis();
		start();
		long endTime = System.currentTimeMillis();
		double runTime = (endTime-startTime);
		out.printf("%n%nRuntime of program is: %.8f sec.", runTime/1000);
	}
		
	void start() {
//		Scanner in = new Scanner(System.in);
//		double INPUT = in.nextDouble();
		
		double number = INPUT;
		double highest = 0;
		for (double i = 2; i <= number; i++) {
			while (number % i == 0) {
//				if (check_prime(i)) {
					number = number / i;
					highest = i;
					if (number < (i * i)){
						highest = number;
						out.printf("%.0f ", highest);
						return;
					}
//				}
			}
		}
		out.printf("%.0f", highest);
	}

	boolean check_prime(double num) {
		// Returns true if prime number
		double sqrt = Math.sqrt(num);
		for (double i = 3; i <= (sqrt); i+=2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	void old_and_slow() {
		double highest = 0;
		for (double i = 1; i <= INPUT * 0.5; i++) {
			if (INPUT % i == 0) {
				if (check_prime(i)) {
					highest = i;
				}
			}
		}
		out.printf("%.0f", highest);
	}

	public static void main(String[] args) {
		new P_003().startT();
	}
}
