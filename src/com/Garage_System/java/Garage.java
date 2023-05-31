package com.Garage_System.java;
import java.util.Date;

public class Garage
{
    public Slot slots[];
    public int free[];
    private  int max_vechicles;
    public Date arrival_time [];
    private int price;
    int configuration;


    public Garage() {

    }

    public Garage( int max_vechicles)
    {
        this.max_vechicles = max_vechicles;
        slots=new Slot[max_vechicles];
        arrival_time =new Date[max_vechicles];
    }
    public void setPrice(int price)
    {
        this.price=price;
    }


    public void setMax_vechicles(int max_vechicles)
    {
        this.max_vechicles = max_vechicles;
        slots=new Slot[max_vechicles];
        free=new int[max_vechicles];
    }
    public int getPrice()
    {
        return price;
    }

    public int getMax_vechicles()
    {
        return max_vechicles;
    }

    public void addSlot(int index , int width , int depth)
    {
        slots[index]=new Slot(width,depth);
        free[index]=0;
    }
    public void setUp(int maxVechicles, int price , int configuration)
    {
        max_vechicles=maxVechicles;
        this.price=price;
        this.configuration=configuration;
        slots=new Slot[max_vechicles];
        free=new int[max_vechicles];
        arrival_time=new Date[max_vechicles];
    }
    public int getConfiguration()
    {
        return configuration;
    }
    public void availableSlots()
    {
        for (int i =0 ; i<max_vechicles ; i++)
        {
            if (free[i]==0)
            {
                System.out.println("Slot number "+ (i+1) + "is free.");
            }
            else
            {
                System.out.println("Slot number "+ (i+1) + "isn't free.");
            }
        }
    }

}
