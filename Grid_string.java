package connectFour;

import java.util.Arrays;

public class Grid {
	
	/******************
	 INSTANCE VARIABLES
	 ******************/
	
	//array to represent Connect Four stand
	String[][] grid;
	
	/************
	 CONSTRUCTORS
	 ************/
	
	//creates stand
	//no parameters
	public Grid() {
		grid = new String[6][7];
      for(int r=0; r<6; r++)
      {
         for(int c=0; c<7; c++)
         {
            grid[r][c] = "[ ]"; 
         }
      }
	}
	
	/********
	 MUTATORS
	 ********/
	
	//adds a piece to grid
	//takes column parameter
	//takes player number parameter
	//drops piece to bottom row in column
	public void place(String pNum, int c) {
		c--;
		for(int r=5; r>=0; r--) {
			if(grid[r][c] == "[ ]") {
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