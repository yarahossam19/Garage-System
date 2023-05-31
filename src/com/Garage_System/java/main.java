package com.Garage_System.java;


public class main {
    public static void main(String[] args)
    {
        Owner owner=new Owner();
        Garage garage=new Garage();
        Display screen=new Display();
        screen.ownerForm(owner,garage);
        screen.driverForm(garage);
    }
}
