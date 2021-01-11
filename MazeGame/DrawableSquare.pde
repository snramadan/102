/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 03a
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableSquare extends Square implements Drawable
{
  public DrawableSquare(boolean up, boolean right, boolean down, boolean left, int row, int col)
  {
    super(up, right, down, left, row, col);
  }

  public void draw()
  {
    if (inView() == true)
    {
      pushMatrix();
      translate(x(), y());
      fill(99, 152, 51);
      rect(0, 0, 50, 50);
      noStroke();
      fill(52, 126, 0);
      ellipse(43, 9, 7, 8);
      ellipse(43, 14, 7, 8);
      ellipse(37.5, 9, 7, 8);

      fill(77, 51, 35);
      noStroke();
      triangle(4, 38, 7, 46, 10, 38);
      triangle(4, 47, 7, 42.5, 10, 47);
      fill(52, 126, 0);
      ellipse(7, 36, 8, 8);
      ellipse(9, 38, 7, 7);
      ellipse(5, 38, 7, 7);

      if (wall(0) == true)
      {    
        stroke(0);
        strokeWeight(1);
        line(0, 0, 50, 0);
      }
      if (wall(1) == true)
      {        
        stroke(0);
        strokeWeight(1);
        line(50, 0, 50, 50);
      }
      if (wall(2) == true)
      {
        stroke(0);
        strokeWeight(1);     
        line(0, 50, 50, 50);
      }
      if (wall(3) == true)
      {
        stroke(0);
        strokeWeight(1);     
        line(0, 0, 0, 50);
      }

      popMatrix();
    } else if (seen() == true)
    {
      pushMatrix();
      translate(x(), y());
      noStroke();
      fill(49, 89, 3);
      ellipse(43, 9, 7, 8);
      ellipse(43, 14, 7, 8);
      ellipse(37.5, 9, 7, 8);

      noStroke();
      fill(30, 13, 0);
      triangle(4, 38, 7, 46, 10, 38);
      triangle(4, 47, 7, 42.5, 10, 47);
      fill(49, 89, 3);
      ellipse(7, 36, 8, 8);
      ellipse(9, 38, 7, 7);
      ellipse(5, 38, 7, 7);
      if (wall(0) == true)
      {
        stroke(0);
        strokeWeight(3);
        line(0, 0, 50, 0);
      }
      if (wall(1) == true)
      {
        stroke(0);
        strokeWeight(3);
        line(50, 0, 50, 50);
      }
      if (wall(2) == true)
      {
        stroke(0);
        strokeWeight(3);        
        line(0, 50, 50, 50);
      }
      if (wall(3) == true)
      {
        stroke(0);
        strokeWeight(3);        
        line(0, 0, 0, 50);
      }

      popMatrix();
    }
  }
}
