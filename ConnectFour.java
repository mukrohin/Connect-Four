/* 
 * Title: Connect Four
 * Owner: Allen Chang / Rohin Mukherjee
 * Creator: Rohin Mukherjee
 * Purpose: A video game version of Connect Four.
 */

package connectFour;

import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		
		Grid stand = new Grid();
		Scanner input = new Scanner(System.in);
		int pNum = 2;
		int c = 0;
		
		System.out.println(stand.toString() +"\n");
		
		do {
			if(pNum == 1) {
				pNum=2;
			}
			else {
				pNum=1;
			}
			
			System.out.print("Player " +pNum +" enter column number:");
			c = Integer.parseInt(input.nextLine());
			stand.place(pNum, c);
			System.out.println(stand.toString() +"\n");
		}
		while(stand.checkForWinner(pNum) == false);
		
		System.out.println("Player " +pNum +" wins!");
		input.close();
	}
}
