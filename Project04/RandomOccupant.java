/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 03(a)
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.*;
import java.*;

public abstract class RandomOccupant extends Occupant implements DelimitedTextIO
{
  private Random rand = new Random();
  private Maze maze;

  public RandomOccupant(Maze maze)
  {
    super();
    this.maze = maze;
    int row = maze.rows();
    int col = maze.cols();
    int x = rand.nextInt(row);
    int y = rand.nextInt(col);
    Square sq = maze.getSquare(x, y);
    super.moveTo(sq);
  }

  public RandomOccupant(Maze maze, long seed)
  {
    super();
    this.maze = maze;
    rand.setSeed(seed);
    int row = maze.rows();
    int col = maze.cols();
    int x = rand.nextInt(row);
    int y = rand.nextInt(col);
    Square sq = maze.getSquare(x, y);
    super.moveTo(sq);
  }

  public RandomOccupant(Maze maze, Square location)
  {
    super(location);
    this.maze = maze;
  }

  public void move()
  {
    Square cursquare = location();
    int row = cursquare.row();
    int col = cursquare.col();
    boolean moved = false;
    Square newsq;
    int dir;
    while (!moved)
    {
      dir = rand.nextInt(4);
      if (dir == Square.UP && !cursquare.wall(Square.UP))
      {
        row--;
        newsq = maze.getSquare(row, col);
        moveTo(newsq);
        moved = true;
      }

      if (dir == Square.RIGHT && !cursquare.wall(Square.RIGHT))
      {
        col++;
        newsq = maze.getSquare(row, col);
        moveTo(newsq);
        moved = true;
      }

      if (dir == Square.DOWN && !cursquare.wall(Square.DOWN))
      {
        row++;
        newsq = maze.getSquare(row, col);
        moveTo(newsq);
        moved = true;
      }

      if (dir == Square.LEFT && !cursquare.wall(Square.LEFT))
      {
        col--;
        newsq = maze.getSquare(row, col);
        moveTo(newsq);
        moved = true;
      }
    }
  } 
  
  public void toObject(Scanner input)
  {
      int row = input.nextInt();
      int col = input.nextInt();
      maze.getSquare(row, col);
  }
}
