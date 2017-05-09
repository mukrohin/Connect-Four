public class Connect_Four
{
private final static int column = 8;
private final static int row = 8;
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
        for (int w = 0; w<8; w++) 
        {
            for (int h = 0; h<8; h++)
            {
               if( h == 7 && w > 0)
               {
               board[w][h] = "|";
               output += board[w][h];
               }
               if ( w == 0 && h<7)
               {
               board[w][h] = " _";
               output += board[w][h];
               }
               else if (w<8 && h<7){
               board[w][h] = "|_";        
               output += board[w][h];
               }
            }
            output += "\n";
        }
        return output;
    } 
 

}