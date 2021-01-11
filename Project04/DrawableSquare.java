/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 4
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableSquare extends Square implements Drawable
{
  //constructor to initialize all the data needed in the parent class
  public DrawableSquare(boolean up, boolean right, boolean down, boolean left, int row, int col)
  {
    super(up, right, down, left, row, col);
  }

  //method to draw itself
  public void draw()
  {
  }
}
