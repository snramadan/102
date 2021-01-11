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

public class ConvexPolygon implements Shape
{
    private Point[] vertices;
    private Color color;
    private boolean filled;

    public ConvexPolygon(Point[] vertices, Color color, boolean filled)
    {
        this.vertices = vertices;
        this.color = color;
        this.filled = filled;
    }
     
    public Point getVertex(int index)
    {
        return vertices[index];
    }

    public void setVertex(int index, Point point)
    {
        this.vertices[index] = point;   
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
    
    public Color getColor()
    {
        return color;
    }

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
        for (int num = 0; num < vertices.length; num++)
        {
             this.vertices[num].x = (vertices[num].x + point.x);
             this.vertices[num].y = (vertices[num].y + point.y);
        }
    }
}
