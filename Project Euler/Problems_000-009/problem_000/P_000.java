package problem_000;

import java.io.PrintStream;

//@Problem:

public class P_000 {

	public P_000() {
		out = new PrintStream(System.out);
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
		new P_000().start(false);
	}

}
