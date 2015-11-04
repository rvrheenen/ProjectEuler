package problem_022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
//@Problem:
//Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. 
//Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
//
//For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
//
//What is the total of all the name scores in the file?


public class P_022 {

	public P_022() {
		out = new PrintStream(System.out);
	}

	PrintStream out;
	Scanner in;

	void start() {
		String reader = "";
		try {
			reader = new BufferedReader(new FileReader("D:/Dropbox/Workspaces/Java/Project Euler/Problems_020-029/problem_022/p022_names.txt")).readLine();
		} catch (IOException e) { e.printStackTrace();}
		
		String sorted[] = bubble(reader.split(","));
		
		int len = sorted.length;
		for (int i = 0;i<len;i++){sorted[i] = sorted[i].replace("\"", "");}
		double total = 0;
		for (int i = 0; i<len;i++){
			int score = (get_word_val(sorted[i]) * (i+1)); 
			total += score;
		}
		out.printf("%.0f", total);
	}
	
	String[] bubble(String[] list){
		int len = list.length;
		boolean swapped = true;
		while (swapped == true){
			swapped = false;
			for (int i = 0; i <len-1; i++){
				if (!a_comes_before_b(list[i], list[i+1])){
					String tmp = list[i+1];
					list[i+1] = list[i];
					list[i] = tmp;
					swapped = true;
				}
			}
		}
		return list;
	}
	
	boolean a_comes_before_b(String a, String b){
		int len = get_shortest(a,b);
		for (int i = 0; i < len;i++){
			if (a.charAt(i)>b.charAt(i)){ return false;}
			else if (a.charAt(i)<b.charAt(i)){ return true;}
		}
		if (a.length()<=b.length()){return true;}
		return false;
	}
	
	int get_shortest(String a, String b){
		int al = a.length();
		int bl = b.length();
		if (al<bl){return al;}
		else {return bl;}
	}
	
	int get_word_val(String str){
		int len = str.length();
		int count = 0;
		for (int i = 0; i<len; i++){
			count += str.charAt(i)-64;
		}
		return count;
	}
	
	void print_list(String[] list){
		for (int i = 0; i<list.length;i++){
			out.printf("%s, ", list[i]);
		}
		out.printf("%n");
	}

	public static void main(String[] args) {
		new P_022().start();
	}

}
