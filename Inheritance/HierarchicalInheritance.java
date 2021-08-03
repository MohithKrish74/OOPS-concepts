package com.polymorphism;
class Vehicle
{
    public void Type()
    {
        System.out.println("What type of Vehicle ? ");
    }
    public void FuelType()
    {
        System.out.println("What is the fuel used ? ");
    }
    public void WheelsCount()
    {
        System.out.println("How many Wheels are present ? ");
    }
    public void Capacity()
    {
        System.out.println("What is the Seating Capacity ? ");
    }
    public void MaximumSpeed()
    {
        System.out.println("What is the Maximum Speed of the Vehicle ? ");
    }
}
class Bike extends Vehicle
{
    public void Type()
    {
        super.Type();
        System.out.println("This is a Bike. ");
        System.out.println("-----------------------------------");
    }
    public void FuelType()
    {
        super.FuelType();
        System.out.println("The fuel used is Petrol. ");
        System.out.println("-----------------------------------");
    }
    public void WheelsCount()
    {
        super.WheelsCount();
        System.out.println("The total number of Wheels is Two. ");
        System.out.println("-----------------------------------");
    }
    public void Capacity()
    {
        super.Capacity();
        System.out.println("The Seating Capacity is Two. ");
        System.out.println("-----------------------------------");
    }
    public void MaximumSpeed()
    {
        super.MaximumSpeed();
        System.out.println("The Maximum Speed of the Vehicle is 60 km/hr. ");
        System.out.println("-----------------------------------");
    }
}
class Car extends Vehicle
{
    public void Type()
    {
        super.Type();
        System.out.println("This is a Car. ");
        System.out.println("-----------------------------------");
    }
    public void FuelType()
    {
        super.FuelType();
        System.out.println("The fuel used is Diesel. ");
        System.out.println("-----------------------------------");
    }
    public void WheelsCount()
    {
        super.WheelsCount();
        System.out.println("The total number of Wheels is Four. ");
        System.out.println("-----------------------------------");
    }
    public void Capacity()
    {
        super.Capacity();
        System.out.println("The Seating Capacity is Four. ");
        System.out.println("-----------------------------------");
    }
    public void MaximumSpeed()
    {
        super.MaximumSpeed();
        System.out.println("The Maximum Speed of the Vehicle is 80 km/hr. ");
        System.out.println("-----------------------------------");
    }
}
class Bus extends Vehicle
{
    public void Type()
    {
        super.Type();
        System.out.println("This is a Bus. ");
        System.out.println("-----------------------------------");
    }
    public void FuelType()
    {
        super.FuelType();
        System.out.println("The fuel used is Diesel. ");
        System.out.println("-----------------------------------");
    }
    public void WheelsCount()
    {
        super.WheelsCount();
        System.out.println("The total number of Wheels is Six. ");
        System.out.println("-----------------------------------");
    }
    public void Capacity()
    {
        super.Capacity();
        System.out.println("The Seating Capacity is Twenty. ");
        System.out.println("-----------------------------------");
    }
    public void MaximumSpeed()
    {
        super.MaximumSpeed();
        System.out.println("The Maximum Speed of the Vehicle is 90 km/hr. ");
        System.out.println("-----------------------------------");
    }
}
public class HierarchicalInheritance
{
    public static void main(String[] args)
    {
        Bike Pulsar = new Bike();
        Car Swift = new Car();
        Bus Volvo = new Bus();
        System.out.println("Bike says: ");
        Pulsar.Type();
        Pulsar.FuelType();
        Pulsar.WheelsCount();
        Pulsar.Capacity();
        Pulsar.MaximumSpeed();
        System.out.println("Car says: ");
        Swift.Type();
        Swift.FuelType();
        Swift.WheelsCount();
        Swift.Capacity();
        Swift.MaximumSpeed();
        System.out.println("Bus says: ");
        Volvo.Type();
        Volvo.FuelType();
        Volvo.WheelsCount();
        Volvo.Capacity();
        Volvo.MaximumSpeed();
    }
}
