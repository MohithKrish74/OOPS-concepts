package com.polymorphism;


class Animals
{
    public void Eat()
    {
        System.out.println("What you eat ? ");
    }
    public void Color()
    {
        System.out.println("What is your color ? ");
    }
    public void Sound()
    {
        System.out.println("How do you bark ? ");
    }
    public void Age()
    {
        System.out.println("What is your age ? ");
    }
    public void LifeSpan()
    {
        System.out.println("What is your maximum life span ? ");
    }
    public void Legs()
    {
        System.out.println("How many legs do you have ? ");
    }
    public void Category()
    {
        System.out.println("Which category do you belong to ? ");
    }
    public void Breed()
    {
        System.out.println("What is your breed ? ");
    }
    public void ChildName()
    {
        System.out.println("What is your Child Name ? ");
    }
    public void Competitor()
    {
        System.out.println("Who is your competitor ? ");
    }
}
class Dog extends Animals
{
    public void Eat()
    {
        System.out.println("I eat pork.");
    }
    public void Color()
    {
        System.out.println("I am Black in  color.");
    }
    public void Sound()
    {
        System.out.println("I barks.");
    }
    public void Age()
    {
        System.out.println("I am 5 years old.");
    }
    public void LifeSpan()
    {
        System.out.println("Maximum life of dogs will be from 10 - 13 years.");
    }
    public void Legs()
    {
        System.out.println("I have Four legs.");
    }
    public void Category()
    {
        System.out.println("I belong to Omnivores.");
    }
    public void Breed()
    {
        System.out.println("I belong to Pug.");
    }
    public void ChildName()
    {
        System.out.println("My Child Name is Puppy.");
    }
    public void Competitor()
    {
        System.out.println("My Competitor is Cat.");
    }

}
class Cat extends Animals
{
    public void Eat()
    {
        System.out.println("I eat Mice.");
    }
    public void Color()
    {
        System.out.println("I am White in  color.");
    }
    public void Sound()
    {
        System.out.println("I Meows.");
    }
    public void Age()
    {
        System.out.println("I am 3 years old.");
    }
    public void LifeSpan()
    {
        System.out.println("Maximum life of cats will be from 2 - 16 years.");
    }
    public void Legs()
    {
        System.out.println("I have Four legs.");
    }
    public void Category()
    {
        System.out.println("I belong to Carnivore.");
    }
    public void Breed()
    {
        System.out.println("I am a Persian Cat.");
    }
    public void ChildName()
    {
        System.out.println("My Child Name is Kitten.");
    }
    public void Competitor()
    {
        System.out.println("My competitor is Racoons.");
    }
}

class Lions extends Animals
{
    public void Eat()
    {
        System.out.println("I eat Meats.");
    }
    public void Color()
    {
        System.out.println("I am Brown in color.");
    }
    public void Sound()
    {
        System.out.println("I Roar.");
    }
    public void Age()
    {
        System.out.println("I am 8 years old.");
    }
    public void LifeSpan()
    {
        System.out.println("Maximum life of cats will be from 10 - 15 years.");
    }
    public void Legs()
    {
        System.out.println("I have Four legs.");
    }
    public void Category()
    {
        System.out.println("I belong to Carnivore.");
    }
    public void Breed()
    {
        System.out.println("I am Barbary Lion.");
    }
    public void ChildName()
    {
        System.out.println("My Child Name is Cub.");
    }
    public void Competitor()
    {
        System.out.println("My competitor is Hyena.");
    }
}
class Cow extends Animals
{
    public void Eat()
    {
        System.out.println("I eat Grass.");
    }
    public void Color()
    {
        System.out.println("I am Brown in color.");
    }
    public void Sound()
    {
        System.out.println("I Moo.");
    }
    public void Age()
    {
        System.out.println("I am 10 years old.");
    }
    public void LifeSpan()
    {
        System.out.println("Maximum life of cats will be from 18 - 22 years.");
    }
    public void Legs()
    {
        System.out.println("I have Four legs.");
    }
    public void Category()
    {
        System.out.println("I belong to Herbivore.");
    }
    public void Breed()
    {
        System.out.println("I am Angus Cattle.");
    }
    public void ChildName()
    {
        System.out.println("My Child Name is Calf.");
    }
    public void Competitor()
    {
        System.out.println("My competitor is Wolf.");
    }
}
class Rabbit extends Animals
{
    public void Eat()
    {
        System.out.println("I eat Carrot.");
    }
    public void Color()
    {
        System.out.println("I am White in color.");
    }
    public void Sound()
    {
        System.out.println("I Squeak.");
    }
    public void Age()
    {
        System.out.println("I am 3 years old.");
    }
    public void LifeSpan()
    {
        System.out.println("Maximum life of cats will be from 0 - 9 years.");
    }
    public void Legs()
    {
        System.out.println("I have Four legs.");
    }
    public void Category()
    {
        System.out.println("I belong to Herbivore.");
    }
    public void Breed()
    {
        System.out.println("I am Angora Rabbit.");
    }
    public void ChildName()
    {
        System.out.println("My Child Name is Bunny.");
    }
    public void Competitor()
    {
        System.out.println("My competitor is Fox.");
    }
}
public class InheritanceUsingAnimalExample
{

    public static void main(String[] args)
    {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        Lions obj3 = new Lions();
        Cow obj4 = new Cow();
        Rabbit obj5 = new Rabbit();
        System.out.println("Dog says: ");
        obj1.Eat();
        obj1.Color();
        obj1.Sound();
        obj1.Age();
        obj1.LifeSpan();
        obj1.Legs();
        obj1.Category();
        obj1.Breed();
        obj1.ChildName();
        obj1.Competitor();
        System.out.println("----------------------------------------------------------");
        System.out.println("Cat says: ");
        obj2.Eat();
        obj2.Color();
        obj2.Sound();
        obj2.Age();
        obj2.LifeSpan();
        obj2.Legs();
        obj2.Category();
        obj2.Breed();
        obj2.ChildName();
        obj2.Competitor();
        System.out.println("----------------------------------------------------------");
        System.out.println("Lion says: ");
        obj3.Eat();
        obj3.Color();
        obj3.Sound();
        obj3.Age();
        obj3.LifeSpan();
        obj3.Legs();
        obj3.Category();
        obj3.Breed();
        obj3.ChildName();
        obj3.Competitor();
        System.out.println("----------------------------------------------------------");
        System.out.println("Cow says: ");
        obj4.Eat();
        obj4.Color();
        obj4.Sound();
        obj4.Age();
        obj4.LifeSpan();
        obj4.Legs();
        obj4.Category();
        obj4.Breed();
        obj4.ChildName();
        obj4.Competitor();
        System.out.println("----------------------------------------------------------");
        System.out.println("Rabbit says: ");
        obj5.Eat();
        obj5.Color();
        obj5.Sound();
        obj5.Age();
        obj5.LifeSpan();
        obj5.Legs();
        obj5.Category();
        obj5.Breed();
        obj5.ChildName();
        obj5.Competitor();
        System.out.println("----------------------------------------------------------");
    }
}


