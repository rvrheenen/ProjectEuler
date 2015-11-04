package problem_032;
import java.io.PrintStream;
import java.util.HashSet;
/*
@Problem: Pandigital products
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
 */

public class P_032 {
	P_032() {
		out = System.out;
	}
	PrintStream out;
	public static final int RANGE = 2000;
	
	void start(boolean Time) {
		long startTime = System.currentTimeMillis();
		HashSet finds = new HashSet();
		double total = 0;
		
		for (int i = 1; i < RANGE; i++){
			for (int j = 1; j < RANGE; j++){
				int ij = i*j;
				if (check_pan(i,j,ij)){
					if (!finds.contains(ij)){
						finds.add(ij);
						total += ij;
					}
				}
			}
		}
		out.printf("Result: %.0f ", total);
		
		if (Time){startT(startTime);}
	}
	
	boolean check_pan(int i, int j, int ij){
		String a = Integer.toString(i);
		a += Integer.toString(j);
		a += Integer.toString(ij);
		HashSet res = new HashSet();
		if (a.length() == 9){
			for (int k = 0; k < a.length();k++){
				res.add(a.charAt(k));
			}
			return (res.size() >= 9 && !res.contains(Integer.toString(0).charAt(0))) ? true : false;
		}
		return false;
	}
	
	void startT(long startTime) {
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}

	public static void main(String[] args) {
		new P_032().start(true);
	}

}
