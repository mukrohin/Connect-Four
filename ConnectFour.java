/* 
 * Title: Connect Four
 * Owner: Allen Chang / Rohin Mukherjee
 * Creator: Rohin Mukherjee
 * Purpose: A video game version of Connect Four.
 */

package connectFour;

public class ConnectFour {

	public static void main(String[] args) {
		
		Grid gird = new Grid();
		gird.place(1, 3);
      gird.place(2, 4);
      gird.place(1, 4);
      gird.place(1, 5);
      gird.place(1, 5);
      gird.place(1, 5);
      gird.place(2, 6);
      gird.place(1, 6);
      gird.place(1, 6);
      gird.place(1, 6);
      
      gird.place(2, 3);
      gird.place(2, 3);
      gird.place(2, 3);
      gird.place(2, 3);
		System.out.println(gird.toString());
      System.out.println(gird.checkForWinner(1));
      System.out.println(gird.checkForWinner(2));
	}
}