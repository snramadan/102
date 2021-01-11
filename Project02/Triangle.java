/**
 * DES
 *
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-09
 * @version Spring 2016
 */

import java.awt.*;
import java.util.*;
import java.lang.*;

public class Triangle implements Shape
{
    private Point a;
    private Point b;
    private Point c;
    private Color color;
    private boolean filled;

    public Triangle(Point a, Point b, Point c, Color color, boolean filled)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.filled = filled;
    }
   
    public Point getVertexA()
    {
        return a;
    }
   
    public void setVertexA(Point point)
    {
        this.a = point;
    }

    public Point getVertexB()
    {
        return b;
    }
   
    public void setVertexB(Point point)
    {
        this.b = point;
    }

    public Point getVertexC()
    {
        return c;
    }
   
    public void setVertexC(Point point)
    {
        this.c = point;
    }
    
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        else if (this.getClass() != other.getClass())
        {
            return false;
        }
        else
        {
            Triangle t = (Triangle)other;
            return a.equals(t.a) && b.equals(t.b) && c.equals(t.c) && color.equals(t.color);
        }
    }
    
    public Color getColor()
    {
        return color;
    }
  
    public double getArea()
    { 
        double sideA = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
        double sideB = Math.sqrt(Math.pow((c.x - b.x), 2) + Math.pow((c.y - b.y), 2));
        double sideC = Math.sqrt(Math.pow((c.x - a.x), 2) + Math.pow((c.y - a.y), 2));
        double s = ((sideA + sideB + sideC))/2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return area;
    }
  
    public void setColor(Color color)
    {
        this.color = color;
    }

    public boolean getFilled()
    {
        if (filled == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
  
    public void move(Point point)
    {
        this.a.x = (a.x + point.x);
        this.a.y = (a.y + point.y);
        this.b.x = (b.x + point.x);
        this.b.y = (b.y + point.y);
        this.c.x = (c.x + point.x);
        this.c.y = (c.y + point.y);
    }
}       
