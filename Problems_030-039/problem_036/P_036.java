package problem_036;
import java.io.PrintStream;
/*
@Problem: Double-base palindromes
The decimal number, 585 = 1001001001(2) (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)

 */

public class P_036 {
	PrintStream out;

	P_036() {
		out = new PrintStream(System.out);
	}
	public static final int RANGE = 1000000;

	void start(boolean Time) {
		long startTime = System.currentTimeMillis();
		
		double sum = 0;
		for (int i = 2; i <= RANGE; i++){
			long bina = get_binar(i);
			if (check_pal(i) && check_pal(bina)){
				sum += i;
			}
		}
		out.printf("%.0f", sum);
		if (Time){startT(startTime);}
	}
	
	long get_binar(int num){
		String sol = "";
		int rng = (int) (Math.log(num)/Math.log(2));
		for (int i = rng; i > 0; i--){
			double tmp = Math.pow(2, i);
				if (num >= tmp && num != 0){
					sol += "1";
					num -= tmp;
				}
				else{
					sol += "0";
				}
			}
		
		long n = Long.valueOf(sol);
		return n;
	}
	
	boolean check_pal(double num) {
		double n = num;
		double res = 0;
		double tmp = 0;
		while (n > 0) {
			tmp = n % 10;
			res = res * 10 + tmp;
			n = Math.floor(n / 10);
		}
		if (res == num) {
			return true;
		}
		return false;
	}
	
	void startT(long startTime) {
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}

	public static void main(String[] args) {
		new P_036().start(true);
	}

}
