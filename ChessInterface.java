
/**
 * Write a description of class ChessInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChessInterface
{
    public static void main(String args[])
    {
        //for now this'll be an string array
        String[][] board = new String[8][8];
        ChessPiece test = new ChessPiece(1,2,"test",1);
        
        //this will get its own method soon
        for(int x = 0; x < board.length; x++)
        {
            String str = "";
            for(int y = 0; y < board.length; y++)
            {
                if (board[x][y] == null)
                board[x][y] = " ";
                str += board[x][y] + ", "; 
            }
            System.out.println(str);
        }
        
        
    }
    
    public static void addToBoard(String[][] board, ChessPiece piece) 
    {
        board[piece.getLocationx()][piece.getLocationy()] = piece.getName();
    }
}
