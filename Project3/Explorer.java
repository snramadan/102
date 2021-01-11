/**
 * Explorer Class
 * 
 * @author Saba Ramadan
 * @version Project 3
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;
import java.awt.event.KeyEvent;

public class Explorer extends Occupant
{
  //instance variable
  private String name;
  private Maze maze;

  //a constructor to initialize all the instance variables
  public Explorer(Square location, Maze maze, String name)
  {
    super(location);
    this.maze = maze;
    this.name = name;
    maze.lookAround(location);
  }

  //query for name
  public String name()
  {
    return name;
  }

  //command the Explorer to move a direction in the Maze based on a key press from the user
  public void move(int key)
  {
    Square cursquare = location();

    if (KeyEvent.getKeyText(key).equals(KeyEvent.getKeyText(KeyEvent.VK_KP_UP)))
    {
      if (!cursquare.wall(Square.UP))
      {
        int row = cursquare.row() - 1;
        int col = cursquare.col();
        Square newsq = maze.getSquare(row, col);
        moveTo(newsq);
      }
    }
    if (KeyEvent.getKeyText(key).equals(KeyEvent.getKeyText(KeyEvent.VK_KP_DOWN)))
    {
      if (!cursquare.wall(Square.DOWN))
      {
        int row = cursquare.row() + 1;
        int col = cursquare.col();
        Square newsq = maze.getSquare(row, col);
        moveTo(newsq);
      }
    }
    if (KeyEvent.getKeyText(key).equals(KeyEvent.getKeyText(KeyEvent.VK_KP_LEFT)))
    {
      if (!cursquare.wall(Square.LEFT))
      {
        int row = cursquare.row();
        int col = cursquare.col() - 1;
        Square newsq = maze.getSquare(row, col);
        moveTo(newsq);
      }
    }
    if (KeyEvent.getKeyText(key).equals(KeyEvent.getKeyText(KeyEvent.VK_KP_RIGHT)))
    {
      if (!cursquare.wall(Square.RIGHT))
      {
        int row = cursquare.row();
        int col = cursquare.col() + 1;
        Square newsq = maze.getSquare(row, col);
        moveTo(newsq);
      }
    }
  }

  //command the Explorer to move to another Square in the Maze
  public void moveTo(Square s)
  {
    super.moveTo(s);
    s.enter();
    maze.lookAround(s);
  }
}
