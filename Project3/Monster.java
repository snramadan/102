/**
 * Monster Class
 *  
 * @author Saba Ramadan
 * @version Project 3
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;
import java.*;

public class Monster extends RandomOccupant
{
  //constructor to randomly locate itself in the Maze
  public Monster(Maze maze)
  {
    super(maze);
  }

  //constructor to randomly locate itself in the Maze with a seed for the Random class
  public Monster(Maze maze, long seed)
  {
    super(maze, seed);
  }

  //constructor to generate a Monster in a specified location in the Maze
  public Monster(Maze maze, Square location)
  {
    super(maze, location);
  }
}
