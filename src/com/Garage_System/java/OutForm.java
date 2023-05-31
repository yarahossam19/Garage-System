package com.Garage_System.java;

public class OutForm implements ParkOutForm
{
    @Override
    public void display(int id, Garage G)
    {
        long fees=new ParkOut(G).getParkingFees(id);
        if (fees==-1)
        {
            System.out.println("Wrong id");
        }
        else
        {
        System.out.println("Please pay " + fees);
        }
    }
}
