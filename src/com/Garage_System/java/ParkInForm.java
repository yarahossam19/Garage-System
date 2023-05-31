package com.Garage_System.java;

public class ParkInForm implements ParkForm
{
    @Override
    public void  display(Vehicle car, Garage G)
    {
        int position=0;
        if (G.getConfiguration()==1)
            position=new ParkIn(G).configration1(car.getWidth(),car.getDepth(),car.getID());
        else if (G.getConfiguration()==2)
            position=new ParkIn(G).configration2(car.getWidth(),car.getDepth(),car.getID());

        if (position>0)
        {
            System.out.println("Sir, you can park your car at position : " + position);
        }
        else
            System.out.println("Sorry , There is no available slots for your car");
    }
}
