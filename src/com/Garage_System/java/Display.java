package com.Garage_System.java;
import java.util.Scanner;

public class Display
{
    public  void driverForm(Garage garage)
    {
        Scanner input=new Scanner(System.in);
        while (true)
        {
            System.out.println("PLease enter 1 if you want to park your car.");
            System.out.println("please enter 2 if you want to park out your car.");
            System.out.println("please enter 0 if you want exit");
        int option = input.nextInt();
        if (option==1)
        {
            ParkInForm form1=new ParkInForm();
            Vehicle car=new Vehicle();
            VechicleIdentification form2=new VechicleIdentification();
            car=form2.identificationForm(car);
            form1.display(car,garage);
        }
        else if(option==2)
        {
            System.out.println("Please enter your car id.");
            int id=input.nextInt();
            OutForm form3 = new OutForm();
            form3.display(id,garage);
        }
        else
        {
            break;
        }
        }
    }

    public void ownerForm(Owner owner , Garage garage)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("To sign up enter 1");
        System.out.println("To log in enter 2");
        int option = input.nextInt();
        String email;
        String password;
        if (option==1)
        {
            System.out.println("please enter your email: ");
            email=input.next();
            System.out.println("please enter your password: ");
            password=input.next();
            owner.signUp(email,password);

            System.out.println("please enter number of slots in the garage.");
            int numSlots=input.nextInt();
            System.out.println("please enter price for hour:");
            int price=input.nextInt();
            System.out.println("For First come First Served configuration enter 1");
            System.out.println("For best fit configuration 2");
            int configuration = input.nextInt();
            garage.setUp(numSlots,price,configuration);

            for (int i =0 ; i<numSlots ; i++)
            {
                System.out.println("Enter width of slot number " + (i+1));
                int width = input.nextInt();
                System.out.println("Enter depth of slot number " + (i+1));
                int depth=input.nextInt();
                garage.addSlot(i,width,depth);
            }

        }
        {
            LoginCheck login=new LoginCheck(owner);
            boolean checker=true;
            do
            {
                System.out.println("please enter your email: ");
                email=input.next();
                System.out.println("please enter your password: ");
                password=input.next();
                checker=login.logIn(email,password);
            }while (checker==false);

            while (true)
            {
            System.out.println("if you want to get total income enter 1.");
            System.out.println("if you want to View available slots enter 2");
            System.out.println("if you want to exit enter 0");
            int order=input.nextInt();
            if (order==1)
            {
             Income in=Income.getInstance();
                System.out.println(in.getIncome());
            }
            else if (order==2)
            {
                garage.availableSlots();
            }
            else
            {
                break;
            }
            }
        }

    }

}
