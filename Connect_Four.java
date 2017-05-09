public class Connect_Four
{
private final static int column = 7;
private final static int row = 7;
private static String[][] board = new String[row][column];
private String player1, player2;

public Connect_Four(String x, String o)
   {
   player1 = x;
   player2 = o;
   }
   
   
public static String printBoard() 
   {
    String output="";
        for (int w = 0; w<7; w++) 
        {
            for (int h = 0; h<7; h++)
            {
               board[w][h] = "|_";        
               output += board[w][h];
            }
            output += "\n";
        }
        return output;
    } 
 

}