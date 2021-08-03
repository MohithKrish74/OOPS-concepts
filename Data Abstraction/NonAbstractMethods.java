package com.polymorphism;

abstract class Bike
{
    void NameOfBike()
    {
        System.out.println("What is the name of the bike ? ");
    }
    void Mileage()
    {
        System.out.println("What is the Mileage of the bike ? ");
    }
    void MaxSpeed()
    {
        System.out.println("What is the Maximum Speed of the bike ? ");
    }
    void MaximumGears()
    {
        System.out.println("What is the Maximum number of Gears in the bike ? ");
    }
    void MaximumLife()
    {
        System.out.println("What is the Maximum life of the bike ? ");
    }
}
class Pulsar extends Bike
{
    void NameOfBike()
    {
        super.NameOfBike();
        System.out.println("This is Pulsar Bike.");
        System.out.println("---------------------------------------");
    }
    void Mileage()
    {
        super.Mileage();
        System.out.println("The Mileage of the bike is 45 km/hr. ");
        System.out.println("---------------------------------------");
    }
    void MaxSpeed()
    {
        super.MaxSpeed();
        System.out.println("The Maximum Speed of the bike is 60 km/hr ");
        System.out.println("---------------------------------------");
    }
    void MaximumGears()
    {
        super.MaximumGears();
        System.out.println("The Maximum number of Gears in the bike is 4 ");
        System.out.println("---------------------------------------");
    }
    void MaximumLife()
    {
        super.MaximumLife();
        System.out.println("The Maximum life of the bike is 15 years ");
        System.out.println("---------------------------------------");
    }
}
class Apache extends Bike
{
    void NameOfBike()
    {
        super.NameOfBike();
        System.out.println("This is Apache Bike.");
        System.out.println("---------------------------------------");
    }
    void Mileage()
    {
        super.Mileage();
        System.out.println("The Mileage of the bike is 50 km/hr. ");
        System.out.println("---------------------------------------");
    }
    void MaxSpeed()
    {
        super.MaxSpeed();
        System.out.println("The Maximum Speed of the bike is 65 km/hr ");
        System.out.println("---------------------------------------");
    }
    void MaximumGears()
    {
        super.MaximumGears();
        System.out.println("The Maximum number of Gears in the bike is 5 ");
        System.out.println("---------------------------------------");
    }
    void MaximumLife()
    {
        super.MaximumLife();
        System.out.println("The Maximum life of the bike is 20 years ");
        System.out.println("---------------------------------------");
    }
}
class Bullet extends Bike
{
    void NameOfBike()
    {
        super.NameOfBike();
        System.out.println("This is Royal Enfield Bullet Bike.");
        System.out.println("---------------------------------------");
    }
    void Mileage()
    {
        super.Mileage();
        System.out.println("The Mileage of the bike is 52 km/hr. ");
        System.out.println("---------------------------------------");
    }
    void MaxSpeed()
    {
        super.MaxSpeed();
        System.out.println("The Maximum Speed of the bike is 55 km/hr. ");
        System.out.println("---------------------------------------");
    }
    void MaximumGears()
    {
        super.MaximumGears();
        System.out.println("The Maximum number of Gears in the bike is 6. ");
        System.out.println("---------------------------------------");
    }
    void MaximumLife()
    {
        super.MaximumLife();
        System.out.println("The Maximum life of the bike is 25 years. ");
        System.out.println("---------------------------------------");
    }
}

public class NonAbstractMethods
{
    public static void main(String[] args)
    {
        Pulsar pulsar = new Pulsar();
        Apache apache = new Apache();
        Bullet bullet = new Bullet();
        System.out.println("Pulsar Details :");
        pulsar.NameOfBike();
        pulsar.Mileage();
        pulsar.MaxSpeed();
        pulsar.MaximumGears();
        pulsar.MaximumLife();
        System.out.println("Apache Details :");
        apache.NameOfBike();
        apache.Mileage();
        apache.MaxSpeed();
        apache.MaximumGears();
        apache.MaximumLife();
        System.out.println("Bullet Details :");
        bullet.NameOfBike();
        bullet.Mileage();
        bullet.MaxSpeed();
        bullet.MaximumGears();
        bullet.MaximumLife();


    }
}
