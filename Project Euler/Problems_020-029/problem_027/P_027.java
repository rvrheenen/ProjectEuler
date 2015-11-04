package problem_027;

import java.io.PrintStream;
//@Problem: Quadratic Primes
//Euler discovered the remarkable quadratic formula:
//
//n² + n + 41
//
//It turns out that the formula will produce 40 primes for the consecutive values n = 0 to 39. 
//However, when n = 40, 40² + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is clearly divisible by 41.
//
//The incredible formula  n² - 79n + 1601 was discovered, which produces 80 primes for the consecutive values n = 0 to 79. 
//The product of the coefficients, -79 and 1601, is -126479.
//
//Considering quadratics of the form:
//
//    n² + an + b, where |a| < 1000 and |b| < 1000
//
//    where |n| is the modulus/absolute value of n
//    e.g. |11| = 11 and |-4| = 4
//
//Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n = 0.


public class P_027 {

	public P_027() {
		out = System.out;
	}

	PrintStream out;

	void startT() {
		//out.printf("%b", check_prime(8));
		long startTime = System.currentTimeMillis();
		start();
		long endTime = System.currentTimeMillis();
		double runTime = (endTime-startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime/1000);
	}
	
	void start(){
		int highestn = 0;
		int highesta = 0;
		int highestb = 0;
		for (int a = -999; a <= 999; a++) {
			for (int b = -999; b <= 999; b++) {
				int n = 0;
				int ans = 0;
				do{
					if (n>highestn){
						highestn = n;
						highesta = a;
						highestb = b;
					}
					ans = Math.abs((int)Math.pow(n, 2) + (a*n) + b);
					n++;
				}while (check_prime(ans));
			}
		}
		out.printf("a: %d b: %d n: %d%n", highesta, highestb, highestn);
		out.printf("Product of a and b: %d", highesta*highestb);
	}
	
	boolean check_prime(double num) {
		// Returns true if prime number
		if (num == 2) {
			return true;
		} else if (num % 2 == 0) {
			return false;
		} else if (num == 1) {
			return false;
		}
		double sqrt = Math.sqrt(num);
		for (double i = 3; i <= (sqrt); i+=2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new P_027().startT();
	}

}
