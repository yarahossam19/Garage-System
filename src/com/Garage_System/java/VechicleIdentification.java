package com.Garage_System.java;

import java.util.Scanner;

public class VechicleIdentification
{
    public Vehicle identificationForm (Vehicle car)
    {
        Scanner input=new Scanner(System.in);
        String modelName=new String();
        int model;
        int width;
        int depth;
        int ID;
        System.out.println("Please enter vehicle Model name:");
        modelName=input.next();
        car.setModelName(modelName);
        System.out.println("Please enter vehicle Model year :");
        model=input.nextInt();
        car.setModel(model);
        System.out.println("Please enter vehicle width:");
        width=input.nextInt();
        car.setWidth(width);
        System.out.println("Please enter vehicle depth:");
        depth=input.nextInt();
        car.setDepth(depth);
        System.out.println("Please enter vehicle ID:");
        ID=input.nextInt();
        car.setID(ID);

        return car;

    }

}
