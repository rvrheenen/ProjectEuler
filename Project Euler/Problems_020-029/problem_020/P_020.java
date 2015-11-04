package problem_020;

import java.io.PrintStream;
import java.math.BigInteger;
//@Problem: Factorial Digit Sum
//n! means n � (n - 1) � ... � 3 � 2 � 1
//
//For example, 10! = 10 � 9 � ... � 3 � 2 � 1 = 3628800,
//and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//Find the sum of the digits in the number 100!

public class P_020 {

	public static final int LIMIT = 100;
	public P_020() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		BigInteger count = new BigInteger("1");
		for (int i = 1; i<=LIMIT; i++){
			BigInteger tmp = BigInteger.valueOf(i);
			count = count.multiply(tmp);
		}
			
		out.printf("%.0f%n", digit_sum(count));
		out.printf("%d! = %d", LIMIT, count);
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
		new P_020().start();
	}

}
