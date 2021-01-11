/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableMaze extends Maze implements Drawable
{
  public DrawableMaze(DrawableSquare[][] maze, int rows, int cols)
  {
    super(maze, rows, cols);
  }

  public void draw()
  {
    pushMatrix();
    background(42, 65, 16);

    for (int row = 0; row < rows(); row++)
    {
         for (int col = 0; col < cols(); col++)
         {
              Square square = getSquare(row, col);
              ((DrawableSquare)square).draw();
         }
    }

    for (int i = 0; i < getNumRandOccupants(); i++)
    {
      ((Drawable)getRandomOccupant(i)).draw();
    }

    ((DrawableExplorer)getExplorer()).draw();
    popMatrix();
  }
}
