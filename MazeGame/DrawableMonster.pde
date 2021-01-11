/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableMonster extends Monster implements Drawable
{
  public DrawableMonster(Maze maze)
  {
    super(maze);
  }

  public DrawableMonster(Maze maze, long seed) 
  {
    super(maze, seed);
  }

  public DrawableMonster(Maze maze, Square location) 
  {
    super(maze, location);
  }

  public void draw()
  {
    if (location().inView() == true)
    {
      pushMatrix();
      translate(location().x(), location().y());
      
      stroke(0);
      strokeWeight(1);
      
      //ears
      fill(101, 100, 99); 
      triangle(8, 20, 11, 6, 22, 12);
      triangle(28, 12, 39, 6, 42, 21);
      fill(237, 161, 184);
      triangle(10, 21, 13, 10, 20, 13);
      triangle(30, 13, 37, 10, 40, 21);

      //face
      fill(101, 100, 99);
      ellipse(25, 25, 35, 30);

      //eyes
      fill(255);
      ellipse(16, 23, 8, 6);
      fill(255);
      ellipse(33, 23, 8, 6);
      fill(0);
      ellipse(16, 23, 4, 4);
      ellipse(33, 23, 4, 4);

      //nose
      fill(0);
      ellipse(25, 29, 3, 2);

      //whiskers
      fill(0);
      line(6, 27, 20, 29);
      line(6, 32, 20, 31);
      line(30, 29, 44, 27);
      line(30, 31, 44, 32);

      //mouth
      fill(0);
      curve(33, 35, 33, 35, 17, 35, 17, 35);

      popMatrix();
    }
  }
}
