/*
 * DES
 * 
 * @author Saba Ramadan
 * @version Project 03a
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableExplorer extends Explorer implements Drawable
{
  public DrawableExplorer(Square location, Maze maze, String name)
  {
    super(location, maze, name);
  }

  public void draw()
  {
    pushMatrix();
    translate(location().x(), location().y());
    stroke(0);
    strokeWeight(1);
    fill(131, 84, 78);
    ellipse(14, 10, 15, 15);
    ellipse(36, 10, 15, 15);
    fill(243, 127, 162);
    ellipse(14, 10, 10, 10);
    ellipse(36, 10, 10, 10);

    fill(131, 84, 78);
    curve(25, 40, 32, 40, 45, 15, 25, 15); 

    stroke(0);
    strokeWeight(1);
    fill(131, 84, 78);
    ellipse(16, 40, 15, 7);
    ellipse(34, 40, 15, 7);

    fill(131, 84, 78);
    ellipse(25, 25, 30, 30);

    fill(255);
    ellipse(19, 20, 10, 11);
    ellipse(31, 20, 10, 11);
    fill(0);
    ellipse(19, 21, 6, 7);
    ellipse(31, 21, 6, 7);
    fill(255);
    noStroke();
    ellipse(18, 18, 4, 4);
    ellipse(30, 18, 4, 4);

    fill(252, 159, 189);
    ellipse(25, 28, 4, 2.5);

    fill(0);
    stroke(0);
    strokeWeight(1);
    line(20, 28, 8, 24);
    line(20, 28, 8, 28);
    line(20, 28, 8, 32);
    line(30, 28, 42, 24);
    line(30, 28, 42, 28);
    line(30, 28, 42, 32);

    fill(255);
    stroke(0);
    strokeWeight(1);
    rect(23, 32, 2, 3);
    rect(25, 32, 2, 3);
    line(21, 32, 29, 32);

    popMatrix();
  }
} 
