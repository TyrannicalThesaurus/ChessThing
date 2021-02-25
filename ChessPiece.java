class ChessPiece
{
 private int[] myLocation; //x and y cord 
 private String myName; //name for the piece ie(king, bishop)
 private int pointValue; //amount of points a piece is worth (pawn = 1, bishop = 3, etc)
 private String myColor; //assigns either black or white to the piece
 
 public ChessPiece(int[] l, String n, int p)
 {
   myLocation = l;
   myName = n;
   pointValue = p;
 }
 
 public int[] getLocation()
 {
   return myLocation;
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
 
 public void setLocation(int[] pos)
 {
     myLocation = pos;
 }
 
 public abstract void movePiece();
}
