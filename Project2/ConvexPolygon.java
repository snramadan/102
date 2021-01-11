/**
 * DES
 *  
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-05
 * @version Fall 2016
 */

import java.awt.*;
import java.util.*;
import java.lang.*;

public class ConvexPolygon implements Shape
{
    private Point[] vertices;
    private Color color;
    private boolean filled;

    //sets diminsions of Convex Polygon
    public ConvexPolygon(Point[] vertices, Color color, boolean filled)
    {
        this.vertices = vertices;
        this.color = color;
        this.filled = filled;
    }

    //inquery for vertex at specific index
    public Point getVertex(int index)
    {
        return vertices[index];
    }

    //sets vertex at index with a given point
    public void setVertex(int index, Point point)
    {
        this.vertices[index] = point;
    }

    //checks if the object inputed is the same as the convex polygon
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
            ConvexPolygon cp = (ConvexPolygon)other;
            if (vertices.length != cp.vertices.length)
            {
                return false;
            }
            for (int i = 0; i < vertices.length; i++)
            {
                if (!vertices[i].equals(cp.vertices[i]))
                {
                    return false;
                }
            }

            if (!color.equals(cp.color))
            {
                return false;
            }
            else if (filled != cp.filled)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }
   
    //inquery for color
    public Color getColor()
    {
        return color;
    }

    //inquery for area
    public double getArea()
    {
        int ynum = 1;
        int newY = 1;
        int sum = 0;
        int sum2 = 0;
        for (int num = 0; num < (vertices.length); num++)
        {
            sum += vertices[num].x * vertices[ynum].y;
            ynum = (ynum + 1)%(vertices.length);
        }
        for (int newnum = 0; newnum < (vertices.length); newnum++)
        {
            sum2 += vertices[newnum].y * vertices[newY].x;
            newY = (newY + 1)%(vertices.length);
        }
        double finsum = (sum - sum2)/2;
        return finsum;
    }

    //sets color
    public void setColor(Color color)
    {
        this.color = color;
    }

    //inquery for if the the con poly is filled or not
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

    //sets to filled
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    //moves vertices by the point given
    public void move(Point point)
    {
        for (int num = 0; num < vertices.length; num++)
        {
             this.vertices[num].x = (vertices[num].x + point.x);
             this.vertices[num].y = (vertices[num].y + point.y);
        }
    }
}
  
