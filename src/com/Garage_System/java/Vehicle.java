package com.Garage_System.java;

public class Vehicle
{
    private String modelName;
    private int model;
    private  int iD;
    private int width;
    private int depth;


    public Vehicle()
    {
        modelName="";
        model=0;
        width=0;
        depth=0;
    }

    public Vehicle(String NameModel, int ModelYear, int wid, int dep)
    {
        modelName=NameModel;
        model=ModelYear;
        width=wid;
        depth=dep;
        iD++;

    }
    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    public void setModel(int model)
    {
        this.model = model;
    }
    public void setID (int ID)
    {
        this.iD=ID;
    }

    public String getModelName()
    {
        return modelName;
    }

    public int getDepth()
    {
        return depth;
    }

    public int getWidth()
    {
        return width;
    }

    public int getModel()
    {
        return model;
    }

    public int getID()
    {
        return iD;
    }
}
