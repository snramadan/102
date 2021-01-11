/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 4
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableMonster extends Monster implements Drawable
{
  //a constructor to initialize all the data needed in the parent class for a Monster with a random location
  public DrawableMonster(Maze maze)
  {
    super(maze);
  }

  // constructor to
  // initialize all the data needed in the parent class for a Monster with a
  // random location and a seeded Random number generator
  public DrawableMonster(Maze maze, long seed) 
  {
    super(maze, seed);
  }

  //constructor to initialize all the data needed in the parent class for a Monster with a given location
  public DrawableMonster(Maze maze, Square location) 
  {
    super(maze, location);
  }

  //draw itself
  public void draw()
  {
  }
}

