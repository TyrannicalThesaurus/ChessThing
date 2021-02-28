
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
        //for now this'll be a string array
        String[][] board = new String[8][8];
        Pawn test = new Pawn(3,2,"test",1);
        
        addToBoard(board,test);
        pause(1000);
        test.moveForward();
        addToBoard(board,test);
        
        pause(1000);
        test.moveForward();
        addToBoard(board,test);
        
        pause(1000);
        test.moveForward();
        addToBoard(board,test);
        
        
    }
    
    public static void addToBoard(String[][] board, ChessPiece piece) 
    {
        board[piece.getLocationx()][piece.getLocationy()] = piece.getName();
        refresh(board);
    }
    
    public static void refresh(String[][] board)
    {
        System.out.println('\u000C');
        for(int y = 0; y < board.length; y++)
        {
            String str = "";
            for(int x = 0; x < board.length; x++)
            {
                if (board[x][y] == null)
                board[x][y] = " ";
                str += board[x][y] + ", "; 
            }
            System.out.println(str);
        }
    }
    
    public static void pause(int n)
    {
        try
        {
            Thread.sleep(n);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
