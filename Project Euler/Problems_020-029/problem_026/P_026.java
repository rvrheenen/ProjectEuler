package problem_026;

import java.io.PrintStream;
/*
@Problem: Reciprocal Cycles
A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

    1/2	= 	0.5
    1/3	= 	0.(3)
    1/4	= 	0.25
    1/5	= 	0.2
    1/6	= 	0.1(6)
    1/7	= 	0.(142857)
    1/8	= 	0.125
    1/9	= 	0.(1)
    1/10	= 	0.1

Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
*/
//NB: DIT MOET IK OPZOEKEN. T_T

public class P_026 {

	public static final int RANGE = 20;
	public P_026() {
		out = System.out;
	}

	PrintStream out;

	void start() {
		for (int i = 1; i < RANGE; i++){
			double tmp = 1/(double)i;
			out.printf("1/%d = %.99f %n", i, tmp);
		}
	}

	public static void main(String[] args) {
		new P_026().start();
	}

}

