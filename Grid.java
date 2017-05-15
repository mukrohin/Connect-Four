package connectFour;

import java.util.Arrays;

public class Grid {
	
	/******************
	 INSTANCE VARIABLES
	 ******************/
	
	//array to represent Connect Four stand
	int[][] grid;
	
	/************
	 CONSTRUCTORS
	 ************/
	
	//creates stand
	//no parameters
	public Grid() {
		grid = new int[6][7];
	}
	
	/********
	 MUTATORS
	 ********/
	
	//adds a piece to grid
	//takes column parameter
	//takes player number parameter
	//drops piece to bottom row in column
	public void place(int pNum, int c) {
		c--;
		for(int r=5; r>=0; r--) {
			if(grid[r][c] == 0) {
				grid[r][c] = pNum;
				break;
			}
		}
	}
	
	/*********
	 ACCESSORS
	 *********/
	
	//toString
	//no parameters
	//outputs the stand as a string
	public String toString() {
		String output = new String();
		for(int r=0; r<6; r++) {
			output += Arrays.toString(grid[r]);
			if(r < 5) {
				output += "\n";
			}
		}
		
		return(output);
	}
}
