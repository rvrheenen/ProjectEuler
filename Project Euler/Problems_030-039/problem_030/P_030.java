package problem_030;
import java.io.PrintStream;
/*
@Problem: Digit fifth powers3

Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 44 + 7^4 + 4^4
As 1 = 1^4 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */

public class P_030 { 
	P_030(){
		out = System.out;
	}
	PrintStream out;
	public static final int POWER = 5;
	
	void start(boolean Time) {
		
		long startTime = System.currentTimeMillis();
		int  range 	   = (int)Math.pow(10, POWER+1);
		int  sum 	   = 0;
		
		for (int i = 2; i < range ; i++){
			int sop = 0;
			String tmp = Integer.toString(i);
			for (int j = 0; j < tmp.length(); j++){
				sop += (Math.pow((int)tmp.charAt(j)-48,POWER));
			}
			if (i == sop){
				sum += sop;
			}
		}
		out.printf("Sum is: %d", sum);
		
		if (Time){startT(startTime);}
	}
	
	void startT(long startTime) {
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}

	public static void main(String[] args) {
		new P_030().start(true);
	}

}
