package problem_028;

import java.io.PrintStream;
//@Problem: Number Spiral Diagonals
//Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
//
//21 22 23 24 25
//20  7  8  9 10
//19  6  1  2 11
//18  5  4  3 12
//17 16 15 14 13
//
//It can be verified that the sum of the numbers on the diagonals is 101.
//
//What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
//1,3,5,7,9,13,17,21,25,31,37,42,49,57,65,73,81,91
//2,2,2,2,4,4,4,4,6,5,7,6,8,8,8,10



public class P_028 {
	public static final int RANGE = 1001;

	public P_028() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		int topR = RANGE*RANGE;
		int cur = 1;
		int total = 1;
		int i = 0;
		while (cur<topR){	
			cur += (2 *((i/4)+1));
			total += cur;
			out.printf("%d ", cur);
			i++;
		}
		out.printf("%nTotal: %d", total);
		
	}

	public static void main(String[] args) {
		new P_028().start();
	}

}
