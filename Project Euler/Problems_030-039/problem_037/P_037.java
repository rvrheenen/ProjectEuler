package problem_037;
import java.io.PrintStream;
/*
@Problem: Truncatable primes
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

 */

public class P_037 {
	P_037() {
		out = System.out;
	}

	PrintStream out;

	void start() {
		
	}
	
	void startT(boolean Time) {
		long startTime = System.currentTimeMillis();
		start();
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}

	public static void main(String[] args) {
		new P_037().startT(true);
	}

}
