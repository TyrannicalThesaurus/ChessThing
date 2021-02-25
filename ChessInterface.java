
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
        //for now this'll be an int array. I could probably make this
        int[][] board = new int[8][8];
        
        board[1][2] = 3;
        //
        for(int x = 0; x < board.length; x++)
        {
            String str = "";
            for(int y = 0; y < board.length; y++)
            {
                str += board[x][y] + ", "; 
            }
            System.out.println(str);
        }
    }
}

