package problem_040;
import java.io.PrintStream;
/*
@Problem: Champernowne's constant

An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...

It can be seen that the 12th digit of the fractional part is 1.

If d(n) represents the nth digit of the fractional part, find the value of the following expression.

d(1) × d(10) × d(100) × d(1000) × d(10000) × d(100000) × d(1000000) //All () are subscripts
 */

public class P_040 { 
	P_040(){
		out = System.out;
	}
	PrintStream out;
	
	void start(boolean Time) {
		
		long startTime = System.currentTimeMillis();
		
		
		if (Time){startT(startTime);}
	}
	
	void startT(long startTime) {
		long   endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}

	public static void main(String[] args) {
		new P_040().start(true);
	}

}
