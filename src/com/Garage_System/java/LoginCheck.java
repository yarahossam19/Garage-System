package com.Garage_System.java;

public class LoginCheck
{
     private Owner owner;
     LoginCheck(){}
     LoginCheck(Owner owner)
     {
         this.owner=owner;
     }
     public boolean logIn(String email , String password)
     {
         if (email.equals(owner.getEmail()) && password.equals(owner.getPassword()))
         {
             System.out.println("Login Successfully");
             return true;
         }
         return false;
     }
}
