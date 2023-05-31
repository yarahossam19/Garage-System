package com.Garage_System.java;
import java.util.Date;
public class ParkOut
{
    private Garage G;

    ParkOut(Garage G)
    {
        this.G=G;
    }

    long getParkingFees(int id)
    {
        int i;
        long total=0;
        boolean found=false;
        Date out=new Date(System.currentTimeMillis());
        for (i=0 ; i<G.slots.length ; i++)
        {
            if (G.free[i]==id)
            {
               G.free[i]=0;
               found=true;
               break;
            }
        }
        if (found) {
            total = CalcDiffTime.calc(G.arrival_time[i], out);
            total *= G.getPrice();
            Income obj=Income.getInstance();
            obj.setIncome(total);
            return total;
        }
        else
            return -1;

    }





}
