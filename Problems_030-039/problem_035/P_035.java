package problem_035;
import java.io.PrintStream;
/*
@Problem: Circular primes
The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?

 */

public class P_035 {
	P_035() {
		out = System.out;
	}

	PrintStream out;
	
	public static final int RANGE = 1000000;
	
	void main(){
		int count = 0;
		for (int i = 0; i <= RANGE; i++){
			if (check_circular(i)){
				count++;
			}
		}
		
		out.printf("%d", count);

	}
	
	boolean check_circular(int num){
		if (check_prime(num)){
			int rng = (int)(Math.log10(num) +1);
			for (int i = 0; i < rng; i++){
				num = get_next_num(num);
				if(!check_prime(num)){
					return false;
				}
			}
			return true;
		}
		else{
			return false;
		}
	}
	
	int get_next_num(int num){
		String s = Integer.toString(num);
		s = s.substring(1) + s.substring(0,1);
		return Integer.parseInt(s);	
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
	
	void start(boolean Time) {
		long startTime = System.currentTimeMillis();
		main();
		if (Time){startT(startTime);}
	}
	
	void startT(long startTime) {
		long endTime = System.currentTimeMillis();
		double runTime = (endTime - startTime);
		out.printf("%n%nRuntime of program is: %.2f sec.", runTime / 1000);
	}

	public static void main(String[] args) {
		new P_035().start(true);
	}

}
