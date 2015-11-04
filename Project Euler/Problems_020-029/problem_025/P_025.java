package problem_025;

import java.io.PrintStream;
import java.math.BigInteger;
//@Problem: 1000-digit Fibonacci number
//The Fibonacci sequence is defined by the recurrence relation:
//
//    F(n) = F(n-1) + F(n-2), where F1 = 1 and F2 = 1.
//
//Hence the first 12 terms will be:
//
//    F1 = 1
//    F2 = 1
//    F3 = 2
//    F4 = 3
//    F5 = 5
//    F6 = 8
//    F7 = 13
//    F8 = 21
//    F9 = 34
//    F10 = 55
//    F11 = 89
//    F12 = 144
//
//The 12th term, F12, is the first term to contain three digits.
//
//What is the first term in the Fibonacci sequence to contain 1000 digits?


public class P_025 {
	public static final int LIMIT = 1000;
	public P_025() {
		out = System.out;
	}

	PrintStream out;

	void start() {
		BigInteger f = BigInteger.valueOf(0);
		BigInteger fnm1 = BigInteger.valueOf(1);
		BigInteger fnm2 = BigInteger.valueOf(1);
		boolean found = false;
		int counter = 2;
		
		while (found != true){
			f = fnm1.add(fnm2);
			fnm2 = fnm1;
			fnm1 = f;
			counter++;
			found = LIMIT<=get_len(f);
		}
		out.printf("%d", counter);
	}
	
	int get_len(BigInteger num){
		return num.toString().length();
	}

	public static void main(String[] args) {
		new P_025().start();
	}

}