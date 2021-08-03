package com.polymorphism;

interface Father
{
     public void Teach();
}

interface Mother
{
    public void Help();
}

class Children implements Father,Mother
{
    public void Teach()
    {
        System.out.println("My Father teaches me everyday about Good Habits. ");
    }

    public void Help()
    {
        System.out.println("My Mother helps me in all the Circumstances. ");
    }
}
public class MultipleInheritance
{
    public static void main(String[] args)
    {
        Children child = new Children();
        child.Teach();
        child.Help();
    }
}
