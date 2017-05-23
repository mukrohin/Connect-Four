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
      int p1score = 0;
      int p2score = 0;
		boolean game = true;
      String answer;
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
        
         if(stand.winCheck(pNum) == true){
         System.out.println("Player " +pNum +" wins! Would you like a rematch?"
         +"\nType yes or no:");
         answer = input.nextLine();
         
            if(answer.equals("yes")){
               if(pNum == 1){
               p1score += 1;
               }
               if(pNum == 2){
               p2score +=1;
               }
            stand.reset();
            System.out.println("The score is "+p1score+" - "+p2score);
            }
            
            else
            {
            game = false;
            System.out.println("Thanks for playing!");
            }
         }
		}
		while(game);
		
      input.close();
      
	}
}
