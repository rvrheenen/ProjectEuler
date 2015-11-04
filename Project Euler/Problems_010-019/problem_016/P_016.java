package problem_016;

import java.io.PrintStream;
import java.math.BigInteger;

// @Problem: Power Digit Sum
//2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
//What is the sum of the digits of the number 2^1000?


public class P_016 {
	
	public static final int POWER = 1000;

	public P_016() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		BigInteger num = new BigInteger("2").pow(POWER);
		out.printf("%.0f", digit_sum(num));
	}
	
	double digit_sum(BigInteger num){
		double sum = 0;
		String number = num.toString();
		for (int i = 0; i<number.length(); i++){
			sum += number.charAt(i)-48;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		new P_016().start();
	}

}
