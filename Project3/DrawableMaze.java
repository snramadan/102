/**
 * Drawable Maze Class
 *  
 * @author Saba Ramadan
 * @version Project 3
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableMaze extends Maze implements Drawable
{
  //a constructor to initialize all the data needed in the parent class
  public DrawableMaze(DrawableSquare[][] maze, int rows, int cols)
  {
    super(maze, rows, cols);
  }

  //draws itself
  public void draw()
  {
  }
}
