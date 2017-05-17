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
	
	// This method uses the player number and checks if
	// that player has met a win condition of the game
	// returns true is the player has won, returns false if
	// the player has not won.
	public boolean winCheck(int pNum) {
		
		//check for winner horizontally
		for(int c=0; c<6; c++) {
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
	
	/*public boolean checkForWinner(int pNum)
	{

	    // check for horizontal winners
	    for (int c = 0; c<4 ; c++ )
	    {
	        for (int r = 0; r<6; r++)
		{
	            if (this.grid[r][c] == pNum && this.grid[r][c+1] == pNum && this.grid[r][c+2] == pNum 
	            && this.grid[r][c+3] == pNum)
		    {
	                return true;
	            }           
	        }
	    }
	    
	    // check for vertical winners
	    for (int r = 0; r<3 ; r++ )
	    {
	        for (int c = 0; c<7; c++)
		{
	            if (this.grid[r][c] == pNum && this.grid[r+1][c] == pNum
	            && this.grid[r+2][c] == pNum && this.grid[r+3][c] == pNum)
		    {
	                return true;
	            }           
	        }
	    }
	    // check for ascending diagonal winners
	    for (int r=3; r<6; r++)
	    {
	        for (int c=0; c<4; c++)
		{
	            if (this.grid[r][c] == pNum && this.grid[r-1][c+1] == pNum && this.grid[r-2][c+2] == pNum
	            && this.grid[r-3][c+3] == pNum)
		    {
	                return true;
		    }
	        }
	    }
	    // check for descending diagonal winners
	    for(int r=3; r<6; r++)
	    {
		  for(int c=3; c<7; c++)
		  {
			  if(this.grid[r][c] == pNum && this.grid[r-1][c-1] == pNum && this.grid[r-2][c-2] == pNum
			  && this.grid[r-3][c-3] == pNum)
			  {
				  return true;
			  }
		  }
	    }
	    return false;
	}*/
}
