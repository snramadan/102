/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableTreasure extends Treasure implements Drawable
{
  public DrawableTreasure(Maze maze)
  {
    super(maze);
  }

  public DrawableTreasure(Maze maze, long seed)
  {
    super(maze, seed);
  }

  public DrawableTreasure(Maze maze, Square location)
  {
    super(maze, location);
  }

  public void draw()
  {
    if (location().seen() == true)
    {
      if (found() == false) 
      {
        pushMatrix();
        translate(location().x(), location().y());
        fill(255, 168, 58);
        stroke(255, 145, 6);
        rotate(-PI/45);
        rect(2, 25, 35, 20);
        stroke(255, 145, 6);
        triangle(4, 25, 11, 18, 32, 24);
        fill(235, 145, 6);
        ellipse(33, 38, 5, 5);
        ellipse(27, 28, 6, 6);
        ellipse(18, 36, 9, 9);
        ellipse(6, 28, 6.5, 6.5);
        ellipse(13, 21, 4, 4);
        ellipse(6, 43, 5, 5);
        ellipse(15, 28, 2, 2);
        ellipse(27, 40, 2, 2);
        ellipse(8, 37, 2, 2);
        ellipse(35, 30, 2, 2);
        
        stroke(0);
        popMatrix();
      } else
      {
        pushMatrix();
        translate(location().x(), location().y()); 
        //noStroke();

        fill(255, 168, 58);
        stroke(255, 145, 6);

        rotate(-PI/45);
        rect(20, 30, 10, 6);

        stroke(255, 145, 6);
        triangle(20, 30, 22, 27, 29, 29);

        fill(235, 145, 6);
        ellipse(25, 32, 3, 3);
        ellipse(29, 35, 2, 2);
        ellipse(21, 35, 2, 2);
        ellipse(24, 29, 2, 2);

        fill(255, 168, 58);
        ellipse(15, 37, 3, 3);
        ellipse(20, 40, 3, 3);
        ellipse(32, 39, 3, 3);
        
        stroke(0);
        popMatrix();
      }
    }
  }
}
