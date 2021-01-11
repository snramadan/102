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

public class Rectangle implements Shape
{
    private double width;
    private double height;
    private Point position;
    private Color color;
    private boolean filled;

    //set dimensions of rectangle
    public Rectangle(double width, double height, Point position, Color color, boolean filled)
    {
        this.width = width;
        this.height = height;
        this.position = position;
        this.color = color;
        this.filled = filled;
    }

    //inquery for width
    public double getWidth()
    {
        return width;
    }

    //sets width
    public void setWidth(double width)
    {
        this.width = width;
    }

    //inquery for height
    public double getHeight()
    {
        return height;
    }

    //sets height
    public void setHeight(double height)
    {
        this.height = height;
    }

    //inquery for position
    public Point getPosition()
    {
        return position;
    }

    //checks if the object inputed is the same as the rectangle
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
            Rectangle r = (Rectangle)other;
            return width == r.width && height == r.height && position.equals(r.position) && color.equals(r.color);
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
        double area = (height * width);
        return area;
    }

    //sets color
    public void setColor(Color color)
    {
        this.color = color;
    }

    //inquery for if the the rectangle is filled or not
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

    //sets rectangle to filled
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    //moves origin point by the numbers in the new point
    public void move(Point point)
    {
        this.position.x = (position.x + point.x);
        this.position.y = (position.y + point.y);
    }
}

