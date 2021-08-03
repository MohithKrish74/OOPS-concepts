package com.polymorphism;
class Animal
{
    public void Eat()
    {
        System.out.println("Eating...");
    }
    public void Color()
    {
        System.out.println("Eating...");
    }
    public void Category()
    {
        System.out.println("Eating...");
    }
    public void ChildName()
    {
        System.out.println("Eating...");
    }
    public void Competitor()
    {
        System.out.println("Eating...");
    }

}
class Lion extends Animal
{
    public void Eat()
    {
        System.out.println("Eating Meat.");
    }
    public void Color()
    {
        System.out.println("Iam Brown in color.");
    }
    public void Category()
    {
        System.out.println("I belong to Carnivore category.");
    }
    public void ChildName()
    {
        System.out.println("My Child name is Cub.");
    }
    public void Competitor()
    {
        System.out.println("My Competitor is Hyena.");
    }
}
public class SingleInheritance
{
    public static void main(String[] args)
    {
        Lion cub = new Lion();
        System.out.println("The Lion Says: ");
        cub.Eat();
        cub.Color();
        cub.Category();
        cub.ChildName();
        cub.Competitor();
    }

}
