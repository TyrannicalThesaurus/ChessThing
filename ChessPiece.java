class ChessPiece
{
    private int myLocationx; //x coord 
    private int myLocationy; //y coord
    private String myName; //name for the piece ie(king, bishop)
    private int pointValue; //amount of points a piece is worth (pawn = 1, bishop = 3, etc)
    private String myColor; //assigns either black or white to the piece

    public ChessPiece(int lx, int ly, String n, int p)
    {
        myLocationx = lx;
        myLocationy = ly;
        myName = n;
        pointValue = p;
    }

    public int getLocationx()
    {
        return myLocationx;
    }
    
    public int getLocationy()
    {
        return myLocationy;
    }

    public String getName()
    {
        return myName;
    }

    public int getPoint()
    {
        return pointValue;
    }

    public String getColor()
    {
        return myColor;
    }

    public void setLocation(int row, int col)
    {
        myLocationx = row;
        myLocationy = col;
    }
    
    public void shift(int horizontal, int vertical)
    {
        vertical = -1 * vertical;
        
        myLocationx += horizontal;
        myLocationy += vertical; 
    }
}
