package problem_024;

import java.awt.List;
import java.io.PrintStream;

/*
 @Problem: Lexicographic Permutations
 A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. 
 If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

 0,1: 2 hits, 1 per number
 01 10
 0,1,2: 6 hits, 2 per number
 012   021   102   120   201   210

 0,1,2,3: 24 hits, 6 per number
 0123 0132 0213 0231 0312 0321 1023 1032 .1203 1230 1302 1320 2013 2031 2103 2130 2301 2310 3012 3021 3102 3120 3201 3210

 0,1,2,3,4: 120 hits, 24 per number
 01234 01243 01324 01342 01423 01432 02143 02134 02341 02314 02431 02413 03124 03142 03214 03241 03412 03421 04132 04123 04231 04213 04321 04312
 10423 10432 10243 10234 10342 10324 12430 12403 12034 12043 12304 12340 13402 13420 13042 13024 13240 13204 14320 14302 14023 14032 14203 14230 
 20341 20314 20431 .20413 20134 20143 21304 21340 21403 21430 21043 21034 23140 23104 23410 23401 23014 23041 24103 24130 24301 24310 24031 24013 
 30124 30142 30214 30241 30412 30421 31042 31024 31240 31204 31420 31402 32014 32041 32104 32140 32401 32410 34021 34012 34120 34102 34210 34201 
 40312 40321 40132 40123 40231 40213 41320 41302 41023 41032 41203 41230 42301 42310 42031 42013 42130 42103 43210 43201 43012 43021 43102 43120
 0  : 1 hit, 0 per number
 0-1: 2 hits, 1 per number
 0-2: 6 hits, 2 per number
 0-3: 24 hits, 6 per number
 0-4: 120 hits, 24 per number
 0-5: 720 hits, 120 per number
 0-6: 5040 hits, 720 per number
 0-7: 40320 hits,	5040 per number
 0-8: 362880 hits, 40320 per number
 0-9: 3628800 hits, 362880 per number

 What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */

public class P_024 {

	public static final int RANGE = 9;
	public static final int SEARCH = 1000000;

	public P_024() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		List digs = new List();
		String solut = "";
		int amnt = RANGE + 1;
		float s = SEARCH - 1;

		for (int i = 0; i <= RANGE; i++) {
			digs.add(Integer.toString(i));
		}

		for (int i = 1; i < amnt; i++) {
			int rng = get_facul(amnt - i);
			int tmp = (int) (s / rng);
			s = s % rng;
			solut = solut + digs.getItem(tmp);
			digs.remove(tmp);
			if (s == 0) {
				for (int j = 0; j < digs.getItemCount(); j++) {
					solut += digs.getItem(j);
				}
				break;
			}
		}
		out.printf("%s", solut);
	}

	int get_facul(int n) {
		int m = 1;
		for (int i = 1; i <= n; i++) {
			m *= i;
		}
		return m;
	}

	public static void main(String[] args) {
		new P_024().start();
	}

}
