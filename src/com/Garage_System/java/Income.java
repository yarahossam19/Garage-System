package com.Garage_System.java;

public class Income
{
    private long amount;
    private  static Income  instance= new Income();

    private Income(){amount=0;}
    public static Income getInstance()
    {
        return instance;
    }

    public void setIncome(long amount)
    { this.amount+=amount;}
    public long getIncome()
    {return amount;}
}

