package com.polymorphism;

import java.util.concurrent.Callable;

interface Animals
{
    public void Eat();
    public void Sound();
    public void Color();
}
interface Animal extends Animals
{
    public void Breed();
    public void Competitor();
}
class Dog implements Animal
{
    public void Eat()
    {
        System.out.println("I eat Pork.");
    }
    public void Sound()
    {
        System.out.println("I Barks.");
    }
    public void Color()
    {
        System.out.println("I am Brown in Color.");
    }
    public void Breed()
    {
        System.out.println("I belong to Pug.");
    }
    public void Competitor()
    {
        System.out.println("My Competitor is Cat.");
    }
}
class Cat implements Animal
{
    public void Eat()
    {
        System.out.println("I eat Mice.");
    }
    public void Sound()
    {
        System.out.println("I Meows.");
    }
    public void Color()
    {
        System.out.println("I am White in Color.");
    }
    public void Breed()
    {
        System.out.println("I belong to Persian Cat.");
    }
    public void Competitor()
    {
        System.out.println("My Competitor is Racoons.");
    }
}
class Lion implements Animal
{
    public void Eat()
    {
        System.out.println("I eat Meat.");
    }
    public void Sound()
    {
        System.out.println("I Roar.");
    }
    public void Color()
    {
        System.out.println("I am Brown in Color.");
    }
    public void Breed()
    {
        System.out.println("I belong to BarBary Lion.");
    }
    public void Competitor()
    {
        System.out.println("My Competitor is Hyena.");
    }
}


public class InterfaceToInterface
{
    public static void main(String[] args)
    {
        Dog puppy = new Dog();
        Cat kitten = new Cat();
        Lion cub = new Lion();
        System.out.println("Dog says: ");
        puppy.Eat();
        puppy.Sound();
        puppy.Color();
        puppy.Breed();
        puppy.Competitor();
        System.out.println("---------------------------------");
        System.out.println("Cat says: ");
        kitten.Eat();
        kitten.Sound();
        kitten.Color();
        kitten.Breed();
        kitten.Competitor();
        System.out.println("---------------------------------");
        System.out.println("Lion says: ");
        cub.Eat();
        cub.Sound();
        cub.Color();
        cub.Breed();
        cub.Competitor();
        System.out.println("---------------------------------");
    }
}
