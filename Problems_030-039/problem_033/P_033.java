package problem_033;
import java.io.PrintStream;
/*
@Problem: Digit cancelling fractions
The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, 
which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.

 */

public class P_033 {
	P_033() {
		out = System.out;
	}
	PrintStream out;

	void start(boolean Time) {
		long startTime = System.currentTimeMillis();
		double[][] res = new double[4][2];
		double product = 0;
		int count = 0;
		for (double num = 11; num <= 99; num++) {
			for (double den = num; den <= 99; den++) {
				if (droid(num, den)) {
					product += (num / den);
					res[count][0] = num;
					res[count][1] = den;
					count++;
					out.printf("%.0f/%.0f%n", num, den);
				}
			}
		}
		
		// All the following is to get the output in a different form.
		// Output is 27/20, or 52284960/38729600, but the denominator should be 100 somehow.
		double[][] tmp = res;
		int t1 = 1;
	
		for (int i = 0; i < tmp.length; i++) {
			t1 *= (int) tmp[i][1];
		}
	
		int t2 = 0;
		for (int i = 0; i < tmp.length; i++) {
			tmp[i][0] *= t1 / tmp[i][1];
			t2 += tmp[i][0];
			tmp[i][1] = t1;
		}
		out.printf("%d/%d = 27/20, which is appearantly not the LCD..%n%n", t2,t1);
		
		double hd = 0;
		double hn = 0;
		for (double i = 1; i <= 1000; i++){
			for (double j = 1; j <= 1000; j++){
				if (i/j == product){
					hn = i;
					hd = j;
				}
			}
			if(hd != 0){
				break;
			}
		}
		out.printf("Nog een attempt: %.0f/%.0f %n%n", hn, hd);
		
		out.printf("Het moet echt sowieso %.0f/%.0f zijn, maar volgens het WWW is het 100 T_T %n", hn, hd);
		
		if (Time){startT(startTime);}
	}
	public int egcd(int a, int b) {
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}
	
	boolean droid(double num, double den){
		//Dit MOET netter kunnen..
		double res = num / den;
		double n1 = Double.toString(num).charAt(0) - 48;
		double n2 = Double.toString(num).charAt(1) - 48;
		double d1 = Double.toString(den).charAt(0) - 48;
		double d2 = Double.toString(den).charAt(1) - 48;
		
		if (d1 != 0 && d2 != 0 && res<1) {
			if (n1 == d2 && (n2 / d1) == res) {
				return true;
			}
			if (n2 == d1 && (n1 / d2) == res) {
				return true;
			}
		}
		return false;
	}
	
	void startT(long startTime) {
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
		
	}
	
	public static void main(String[] args) {
		new P_033().start(true);
	}

}
