package com.Garage_System.java;

public class Slot {
    private int width;
    private int depth;

    Slot()
    {}
    Slot(int w , int d)
    {
        width=w;
        depth=d;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    public int getWidth()
    {
        return width;
    }

    public int getDepth()

    {
        return depth;
    }
}
