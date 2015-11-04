package problem_004;

import java.io.PrintStream;
//import java.util.Scanner;

//@Problem:
//A palindromic number reads the same both ways. 
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

public class P_004 {

	public static final int DIGITS = 3;

	public P_004() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
//		Scanner in = new Scanner(System.in);
//		int digits = in.nextInt();
		
		int input = dig_to_int(DIGITS);
		int highest = 0;
		int num = 0;
		for (int i = 0; i <= input; i++) {
			for (int j = 0; j <= input; j++) {
				num = i * j;
				if (num > highest) {
					if (check_pal(num)) {
						highest = num;
						// out.printf("I: %d, J: %d, %d%n", i, j, highest);
					}
				}
			}
		}
		out.printf("%d", highest);
	}

	boolean check_pal(int num) {
		int n = num;
		int res = 0;
		int tmp = 0;
		while (n > 0) {
			tmp = n % 10;
			res = res * 10 + tmp;
			n = n / 10;
		}
		if (res == num) {
			return true;
		}
		return false;
	}

	int dig_to_int(int dig) {
		String num = "";
		for (int i = 0; i < dig; i++) {
			num += "9";
		}
		int res = Integer.parseInt(num);
		return res;
	}

	public static void main(String[] args) {
		new P_004().start();
	}

}
