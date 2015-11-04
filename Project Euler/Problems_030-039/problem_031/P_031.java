package problem_031;
import java.io.PrintStream;
/*
@Problem: Coin sums
In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
 */

public class P_031 {
	P_031() {
		out = System.out;
	}

	PrintStream out;

	void start(boolean Time) {
		long startTime = System.currentTimeMillis();
		
		if (Time){startT(startTime);}
	}
	
	void startT(long startTime) {
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}
	
	public static void main(String[] args) {
		new P_031().start(false);
	}

}
