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
      output = " 1, 2, 3, 4, 5, 6, 7\n -------------------\n";
		for(int r=0; r<6; r++) {
			output += Arrays.toString(grid[r]);
			if(r < 5) {
				output += "\n";
			}
		}
		
		return(output);
	}
   //this method doesn't need a
   //parameter and doesn't have an 
   //output
   //it resets the board so players
   //can play again
	public void reset() {
      for(int r=0; r<6; r++) {
         for(int c=0; c<7; c++){
            grid[r][c] = 0;
            }
            }
           
            }
	// This method uses the player number and checks if
	// that player has met a win condition of the game
	// returns true is the player has won, returns false if
	// the player has not won.
	public boolean winCheck(int pNum) {
		
		//check for winner horizontally
		for(int c=0; c<4; c++) {
			for(int r=0; r<6; r++) {
				if(grid[r][c] == pNum && grid[r][c+1] == pNum
						&& grid[r][c+2] == pNum && grid[r][c+3] == pNum) {
					return(true);
				}
			}
		}
		
		//check for winner vertically
		for(int r=0; r<3; r++) {
			for(int c=0; c<7; c++) {
				if(grid[r][c] == pNum && grid[r+1][c] == pNum
						&& grid[r+2][c] == pNum && grid[r+3][c] == pNum) {
					return(true);
				}
			}
		}
		
		//check for winner diagonally ascending
		for(int r=3; r<6; r++) {
			for(int c=0; c<4; c++) {
				if(grid[r][c] == pNum && grid[r-1][c+1] == pNum
						&& grid[r-2][c+2] == pNum && grid[r-3][c+3] == pNum) {
					return(true);
				}
			}
		}
		
		//check for winner diagonally descending
		for(int r=3; r<6; r++) {
			for(int c=3; c<7; c++) {
				if(grid[r][c] == pNum && grid[r-1][c-1] == pNum
						&& grid[r-2][c-2] == pNum && grid[r-3][c-3] == pNum) {
					return(true);
				}
			}
		}
		
		//else no winners
		return(false);
	}
	
	
}
