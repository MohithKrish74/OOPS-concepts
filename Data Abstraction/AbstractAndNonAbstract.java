package com.polymorphism;

abstract class School
{
    void SchoolName()
    {
        System.out.println("This is High School");
    }
    abstract void roll_no();
    abstract void NameOfStudent();
    abstract void Age();
    void SchoolFee()
    {
        System.out.println("The School Fee for the current year is 32,500 ");
    }
}
class Student1 extends School
{
    public void roll_no()
    {
        System.out.print("1 ");
    }
    public void NameOfStudent()
    {
        System.out.print("Ram ");
    }
    public void Age()
    {
        System.out.println("20 ");
    }

}
class Student2 extends School
{
    public void roll_no()
    {
        System.out.print("2 ");
    }
    public void NameOfStudent()
    {
        System.out.print("Sam ");
    }
    public void Age()
    {
        System.out.println("21 ");
    }
}
public class AbstractAndNonAbstract
{
    public static void main(String[] args)
    {
        Student1 student1 =new Student1();
        Student2 student2 =new Student2();
        System.out.println("Details of the School: ");
        student1.SchoolName();
        student1.roll_no();
        student1.NameOfStudent();
        student1.Age();
        student1.SchoolFee();
        System.out.println("-----------------------------------------------");
        System.out.println("Details of the School: ");
        student2.SchoolName();
        student2.roll_no();
        student2.NameOfStudent();
        student2.Age();
        student2.SchoolFee();
        System.out.println("-----------------------------------------------");




    }
}
