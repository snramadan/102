/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;
import java.*;

public class Monster extends RandomOccupant
{
  public Monster(Maze maze)
  {
    super(maze);
  }

  public Monster(Maze maze, long seed)
  {
    super(maze, seed);
  }

  public Monster(Maze maze, Square location)
  {
    super(maze, location);
  }
}
