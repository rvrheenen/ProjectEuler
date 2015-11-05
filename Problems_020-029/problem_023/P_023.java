package problem_023;

import java.io.PrintStream;
import java.util.HashSet;
//@Problem: Non-abundant Sums
//A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
//For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
//
//A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
//
//As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. 
//By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. 
//However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
//
//Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

public class P_023 {

	public static final int LIMIT = 28123;
	public P_023() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		int count = 0;
		double total = 0;
		int[] abundants = new int[7000];
		HashSet sums = new HashSet();
		
		for(int i = 1; i<LIMIT;i++){
			double tmp = sum_factors(i);
			if (tmp>i){
				abundants[count] = i;
				count++;
			}
		}
		
		for(int i = 0; i<count;i++){
			int is = abundants[i];
			for (int j = 0; j<count;j++){
				int isj = is+abundants[j];
				sums.add(isj);
			}
		}

		for (int i = 1;i<=LIMIT;i++){
			if (!sums.contains(i)){
				
				total+= i;
			}
		}
		out.printf("%.0f", total);
	}
	
	double sum_factors(double num) {
		double count = -num;
		double sqrt = Math.sqrt(num);
		for (double i = 1; i <= sqrt; i++) {
			if (i * i == num) {
				count += i;
			} else if (num % i == 0) {
				count += (i + (num / i));
			}
		}

		return count;
	}

	public static void main(String[] args) {
		new P_023().start();
	}

}
