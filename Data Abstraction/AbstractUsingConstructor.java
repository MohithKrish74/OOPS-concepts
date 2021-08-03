package com.polymorphism;

abstract class Car
{
    public Car()
    {
        System.out.println("The Car brands Description is as follows:");
    }
    abstract void BrandName();
    abstract void Domicile();
    abstract void LatestCar();
    public void display()
    {
        System.out.println("Thus,the Brand detail is discussed!!! ");
    }
}
class Mercedes extends Car
{
    public void BrandName()
    {
        System.out.println("This is Mercedes Benz");
    }
    public void Domicile()
    {
        System.out.println("Germany ");
    }
    public void LatestCar()
    {
        System.out.println("Mercedes Benz A - Class");
    }
}
class Tesla extends Car
{
    public void BrandName()
    {
        System.out.println("This is Tesla");
    }
    public void Domicile()
    {
        System.out.println("America ");
    }
    public void LatestCar()
    {
        System.out.println("Tesla Model 3");
    }
}
class Suzuki extends Car
{
    public void BrandName()
    {
        System.out.println("This is Maruti Suzuki");
    }
    public void Domicile()
    {
        System.out.println("Japan ");
    }
    public void LatestCar()
    {
        System.out.println("Suzuki Nexa");
    }
}
public class AbstractUsingConstructor
{
    public static void main(String[] args)
    {
         Mercedes benz =new Mercedes();
         System.out.println("Mercedes: ");
         benz.BrandName();
         benz.Domicile();
         benz.LatestCar();
         benz.display();
         System.out.println("---------------------------------");
         Tesla model1 = new Tesla();
         System.out.println("Tesla: ");
         model1.BrandName();
         model1.Domicile();
         model1.LatestCar();
         model1.display();
         System.out.println("---------------------------------");
         Suzuki swift = new Suzuki();
         System.out.println("Suzuki: ");
         swift.BrandName();
         swift.Domicile();
         swift.LatestCar();
         swift.display();
         System.out.println("---------------------------------");

    }
}
