package com.Garage_System.java;

public class Owner {
    private String email;
    private String password;


    public Owner()
    {
        email=new String();
        password = new String();

    }
    public void signUp(String email , String password)
    {
        this.email=email;
        this.password=password;

    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

}
