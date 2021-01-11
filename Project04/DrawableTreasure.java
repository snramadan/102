/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 4
 * @version CPE102-05
 * @version Fall 2016
 */

public class DrawableTreasure extends Treasure implements Drawable
{
  //constructor to initialize all the data needed in the parent class for a treasure with a random location
  public DrawableTreasure(Maze maze)
  {
    super(maze);
  }

  //constructor to initialize all the data needed in the parent class for a Treasure with a random location and a seeded Random number generator.
  public DrawableTreasure(Maze maze, long seed)
  {
    super(maze, seed);
  }

  //constructor to initialize all the data needed in the parent
  public DrawableTreasure(Maze maze, Square location)
  {
    super(maze, location);
  }

  //draw itself
  public void draw()
  {
  }
}
