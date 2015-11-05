package problem_019;

import java.io.PrintStream;

// @Problem: Counting Sundays
//You are given the following information, but you may prefer to do some research for yourself.
//
//    1 Jan 1900 was a Monday.
//    Thirty days has September,
//    April, June and November.
//    All the rest have thirty-one,
//    Saving February alone,
//    Which has twenty-eight, rain or shine.
//    And on leap years, twenty-nine.
//    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
//
//How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

public class P_019 {

	public P_019() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		int months[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
				31 };
		String weekdays[] = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		int count = 0;
		int cur_day = 0;
		for (int year = 1900; year <= 2000; year++) {
			months[1] = leap(year);
			for (int month = 1; month <= 12; month++) {
				for (int day = 1; day <= months[month - 1]; day++) {
					cur_day++;
//					out.printf("%n%d: %s, %d-%d-%d", cur_day, weekdays[(cur_day-1)%7], day, month, year);
					if ((cur_day) % 7 == 0 && year >= 1901 && day == 1) {
//						out.printf(" !! <============== !!");
						count++;
					}
				}
			}
		}
		out.printf("%d", count);
	}

	int leap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return 29;
		} else
			return 28;
	}

	public static void main(String[] args) {
		new P_019().start();
	}

}
