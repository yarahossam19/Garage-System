package com.Garage_System.java;
import java.util.Date;

public class ParkIn  implements BestFit,FirstComeFirstServed
{
    private Garage G;
    public ParkIn(Garage G)
    {
        this.G=G;
    }
    @Override
    public int configration1(int w , int d , int id)
    {
        int i;
        for (i=0; i<G.slots.length; i++) {
            if (w <= G.slots[i].getWidth() && d <= G.slots[i].getDepth() && G.free[i] == 0)
            {
                G.free[i] = id;
              break;
            }
        }
        G.arrival_time[i]=new Date(System.currentTimeMillis());

        return i + 1;

    }
    @Override
    public int configration2(int w , int d , int id)
        {int MinWidth=100000;
        int Mindepth=100000;
        int position=0;
        for (int i=0 ; i<G.slots.length ; i++)
        {
            if ( w <= G.slots[i].getWidth() && d<=G.slots[i].getDepth() && G.free[i] == 0
                    && Mindepth>=G.slots[i].getDepth() && MinWidth>= G.slots[i].getWidth() )
            {
                position=i+1;
                MinWidth=G.slots[i].getWidth();
                Mindepth=G.slots[i].getDepth();
            }
        }
        if (position>0)
        {
            G.free[position-1]=id;
            G.arrival_time[position-1]=new Date(System.currentTimeMillis());
        }
        return position;
    }
}
