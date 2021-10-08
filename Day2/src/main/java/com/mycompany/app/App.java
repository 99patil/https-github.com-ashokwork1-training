package com.mycompany.app;

public class App 
{
    public static void main( String[] args )
    {
       User u1 = new User();
       //u1.age = 10.0f;
       u1.weight=200;

       System.out.println( "U1 's strength is " + u1.getStrenth());
       u1.setAge(100);
       System.out.println( "U1 's strength is " + u1.getStrenth());
       //u1.age = 100.0f;

       //Inheritance demonstration
       ModernUser mu1 = new ModernUser();
       mu1.expYears=10;
       System.out.println( "MU1 's strength is " + mu1.getStrenth());


       // Polymorphism demonstration
       User mu2 = new ModernUser();
       // mu2.expYears=2; // we will get an error here because expYears field is Not defined in User class
       //what do you think of which class's (User or ModernUser) getStrength will be called?
       System.out.println( "MU2 's strength is " + mu2.getStrenth());


       System.out.println( "U1's age is "+ u1.getAge("client5"));

       User u2 = new User(19.0f);
       //u2.age = 19.0f;
       u2.weight=20;

       System.out.println( "U2 's strength is " + u2.getStrenth());
    }

    public static void printMe(){
        System.out.println( "Good day for you! " );
    }
}
