package problem_009;

import java.io.PrintStream;

//@Problem:

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for
//which,
//a^2 + b^2 = c^2
//
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class P_009 {

	public static final int TARGET = 1000;

	public P_009() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		boolean reached = false;
		int r = 2;

		for (int c = 1; c <= r; c++) {
			for (int b = 1; b <= r; b++) {
				for (int a = 1; a <= r; a++) {
					if ((a + b + c) == TARGET) {
						 if ((((a * a) + (b * b)) == (c * c)) && (reached == false)) {
							out.printf("a = %d, b = %d, c = %d, a*b*c = %d", a, b, c, (a*b*c));
							reached = true;
						}
					}
				}
			}
			if (reached == false) {
				r++;
			}
		}
	}


	public static void main(String[] args) {
		new P_009().start();
	}

}
