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

public class Square
{
  public static final int SQUARE_SIZE = 50;
  public static final int UP = 0;
  public static final int RIGHT = 1;
  public static final int DOWN = 2;
  public static final int LEFT = 3;

  private boolean[] walls = new boolean[4];
  private boolean seen;
  private boolean inView;
  private int row;
  private int col;
  private Treasure treasure;

  public Square(boolean up, boolean right, boolean down, boolean left, int row, int col)
  {
    this.walls[0] = up;
    this.walls[1] = right;
    this.walls[2] = down;
    this.walls[3] = left;
    this.row = row;
    this.col = col;
    this.seen = false;
    this.inView = false;
    this.treasure = null;
  }

  public boolean wall(int direction)
  {
    return walls[direction];
  }

  public boolean seen()
  {
    return seen;
  }

  public boolean inView()
  {
    return inView;
  }

  public int row()
  {
    return row;
  }

  public int col()
  {
    return col;
  }

  public Treasure treasure()
  {
    return treasure;
  }

  public int x()
  {
    int x = col * SQUARE_SIZE;
    return x;
  }

  public int y()
  {
    int y = row * SQUARE_SIZE;
    return y;
  }

  public void setInView(boolean inView)
  {
    this.inView = inView;
    if (inView == true)
    {
      this.seen = true;
    }
  }

  public void setTreasure(Treasure t)
  {
    this.treasure = t;
  }

  public void enter()
  {
    if (treasure != null)
    {
      treasure.setFound();
    }
  }
}
