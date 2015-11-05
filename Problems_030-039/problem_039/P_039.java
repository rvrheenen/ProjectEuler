package problem_039;
import java.io.PrintStream;
/*
@Problem: Integer right triangles
If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?

 */

public class P_039 {
	P_039() {
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
		new P_039().start(false);
	}

}
