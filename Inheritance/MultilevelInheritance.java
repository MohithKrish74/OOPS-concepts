package com.polymorphism;

class GrandFather
{
    public void Age()
    {
        System.out.println("I am 70 years old.");
    }
}
class father extends GrandFather
{
    public void Education()
    {
        System.out.println("Completed BE and MBA");
    }
}
class Child extends father
{
    public void Hobbies()
    {
        System.out.println("My hobbies is Sports");
    }
}

public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        Child small = new Child();
        small.Age();
        small.Education();
        small.Hobbies();
    }
}
