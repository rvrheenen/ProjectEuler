package problem_034;
import java.io.PrintStream;
/*
@Problem: Digit factorials
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.

 */

public class P_034 {
	P_034() {
		out = System.out;
	}

	PrintStream out;

	void start(boolean Time) {
		long startTime = System.currentTimeMillis();
		double sum = 0;
		for (double i = 3; i < Math.pow(10, 6); i++) {
			double res = get_fact((int)i);
			if (res == i){ 
				sum += res;
			}
		}
		out.printf("%.0f%n", sum);
		if (Time){startT(startTime);}
	}
	
	double get_fact(int num){
		String n = Integer.toString(num);
		double sol = 0;
		for (int i = 0; i < n.length(); i++){
			int rng = n.charAt(i)-48;
			double tmp = 1;
			for (int j = 1; j <= rng; j++){
				tmp *= j;
			}
			sol += tmp;
		}
		return sol;
	}
	
	void startT(long startTime) {
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}

	public static void main(String[] args) {
		new P_034().start(false);
	}

}
