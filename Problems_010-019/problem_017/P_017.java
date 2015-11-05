package problem_017;

import java.io.PrintStream;

// @Problem: Number letter counts
//If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
//If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
//
//NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
//The use of "and" when writing out numbers is in compliance with British usage.

public class P_017 {

	public String[] list1to19 = new String[] { "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };
	
	public String[] list20to90 = new String[] { "twenty", "thirty", "forty",
			"fifty", "sixty", "seventy", "eighty", "ninety" };
	
	public P_017() {
		out = new PrintStream(System.out);
		
	}

	PrintStream out;

	void start() {
		int input = 1000;
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			out.printf("%d: ", i);
			int counted = count(i);
			sum += counted;
			out.printf(" %d %n", counted);
		}
		out.printf("Total: %d", sum);
	}
	
	int count(int i){
		//FUCKING LELIJK, MOET IK EIGENLIJK WAT AAN DOEN
		int sum = 0;
		if (i == 1000) {
			sum += "onethousand".length();
			out.printf("%s", "onethousand");
		} else if (i >= 100) {
			sum += list1to19[(i / 100) - 1].length();
			out.printf("%s", list1to19[(i / 100) - 1]);
			sum += "hundred".length();
			out.printf("%s", " hundred");
			
		}
		if (((i) % 100) > 0) {
			if (i>100){
			sum += "and".length();
			out.printf("%s", " and ");
			}
			if (((i) % 100) < 20) {
				sum += list1to19[(i % 100)-1].length();
				out.printf("%s", list1to19[(i % 100)-1]);
			}
			else {
				sum += list20to90[((((i)%100)/10))-2].length();
				out.printf("%s", list20to90[((((i)%100)/10))-2]);
				if (i%10 != 0){
					sum += list1to19[(i % 10)-1].length();
					out.printf("-%s", list1to19[(i % 10)-1]);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		new P_017().start();
	}

}
