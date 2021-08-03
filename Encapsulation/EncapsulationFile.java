package com.polymorphism;

import javax.swing.*;

class Student
{
    private int RollNo;
    private String Name;
    private int Age;
    private String SchoolName;
    private int Rank;
    public int getRollNo()
    {
        return RollNo;
    }
    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public int getRank()
    {
        return Rank;
    }
    public String getSchoolName()
    {
        return SchoolName;
    }
    public void setRollNo(int rollNo)
    {
        RollNo=rollNo;
    }
    public void setName(String name)
    {
        Name = name;
    }
    public void setAge(int age)
    {
        Age=age;
    }
    public void setRank(int rank)
    {
        Rank=rank;
    }
    public void setSchoolName(String schoolName)
    {
        SchoolName=schoolName;
    }
}
public class EncapsulationFile
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setRollNo(1);
        student.setName("Ram");
        student.setAge(20);
        student.setRank(2);
        student.setSchoolName("Montessori");
        System.out.println(student.getRollNo()+" "+student.getName()+" "+student.getAge()+" "+student.getRank()+" "+student.getSchoolName());
    }
}
