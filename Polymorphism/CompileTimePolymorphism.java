package com.polymorphism;
class Student
{
    public int marks(int mark1)
    {
        return mark1;
    }
    public int marks(int mark1,int mark2)
    {
        return mark1+mark2;
    }
    public int marks(int mark1,int mark2,int mark3)
    {
        return mark1+mark2+mark3;
    }
    public int marks(int mark1,int mark2,int mark3,int mark4)
    {
        return mark1+mark2+mark3+mark4;
    }
    public int marks(int mark1,int mark2,int mark3,int mark4,int mark5)
    {
        return mark1+mark2+mark3+mark4+mark5;
    }


}

public class CompileTimePolymorphism
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        System.out.println("The Student with one subject mark is "+obj.marks(100)+" out of 100");
        System.out.println("The Student with two subject mark is "+obj.marks(99,100)+" out of 200");
        System.out.println("The Student with three subject mark is "+obj.marks(89,100,90)+" out of 300");
        System.out.println("The Student with four subject mark is "+obj.marks(92,91,89,100)+" out of 400");
        System.out.println("The Student with all subject mark is "+obj.marks(90,100,99,85,94)+" out of 500");
    }
}
