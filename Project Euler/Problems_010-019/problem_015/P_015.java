package problem_015;

import java.io.PrintStream;

//@Problem: Lattice Paths
//Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
//
//
//	_ _
//	   |
//	   |
//	
//	__
//	  |_
//	    |
//	  
//	_
//	 |
//	 |_
//	 
//	|_ _
//	    |
//	
//	|_
//	  |_
//	  
//	|
//	|_ _
//
//How many such routes are there through a 20×20 grid?

public class P_015 {

	public static final int SIZE_X = 20;
	public static final int SIZE_Y = 20 ;
	public static double count = 0;

	public P_015() {
		out = new PrintStream(System.out);
	}

	PrintStream out;

	void start() {
		create_grid();
	}

	void create_grid() {
		double grid[][] = new double[SIZE_X+1][SIZE_Y+1];

		for (int i = 0; i <= SIZE_X; i++) {
			grid[i][0] = 1;
		}
		for (int i = 0; i <= SIZE_Y; i++) {
			grid[0][i] = 1;
		}

		for (int i = 1; i <= SIZE_X; i++) {
			for (int j = 1; j <= SIZE_Y; j++) {
				grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
			}
		}
//		print_grid(grid);
		out.printf("%.0f", grid[SIZE_X][SIZE_Y]);
	}
	
	void print_grid(double[][] grid){
		for (int i = 0; i <= SIZE_X; i++) {
			for (int j = 0; j <= SIZE_Y; j++) {
				out.printf("%.0f -", grid[i][j]);
			}
			out.printf("%n");
		}
	}

	void table2(int x, int y, int vx, int vy, int xy) {
	}

	void trial(int x, int y) {
		// Call this method with "trial(0,0);" and all combinations will be
		// calculated recursively yet inefficiently.
		out.printf("(%d,%d)%n", x, y);
		if (x == SIZE_X && y == SIZE_Y) {
			count++;
		} else {
			if (x < SIZE_X) {
				trial(x + 1, y);
			}
			if (y < SIZE_Y) {
				trial(x, y + 1);
			}
		}
	}

	public static void main(String[] args) {
		new P_015().start();
	}

}
