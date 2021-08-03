package com.polymorphism;

abstract class Bank
{
    abstract void NameOfBank();
    abstract void RateOfInterests();
    abstract void Sector();
    abstract void MinimumBalance();
    abstract void Branch();
}

class SBI extends Bank
{
    public void NameOfBank()
    {
        System.out.println("This is SBI Bank.");
    }
    public void RateOfInterests()
    {
        System.out.println("Rate of Interests is 5%.");
    }
    public void Sector()
    {
        System.out.println("It belong to Government Sector.");
    }
    public void MinimumBalance()
    {
        System.out.println("The Minimum Balance should be Rupees 1000.");
    }
    public void Branch()
    {
        System.out.println("It has a Branch in Chennai.");
    }
}
class IndianBank extends Bank
{
    public void NameOfBank()
    {
        System.out.println("This is Indian Bank.");
    }
    public void RateOfInterests()
    {
        System.out.println("Rate of Interests is 3%.");
    }
    public void Sector()
    {
        System.out.println("It belong to Government Sector.");
    }
    public void MinimumBalance()
    {
        System.out.println("The Minimum Balance should be Rupees 500.");
    }
    public void Branch()
    {
        System.out.println("It has a Branch in Velachery.");
    }
}
class ICICI extends Bank
{
    public void NameOfBank()
    {
        System.out.println("This is ICICI Bank.");
    }
    public void RateOfInterests()
    {
        System.out.println("Rate of Interests is 10%.");
    }
    public void Sector()
    {
        System.out.println("It belong to Private Sector.");
    }
    public void MinimumBalance()
    {
        System.out.println("The Minimum Balance should be Rupees 5000.");
    }
    public void Branch()
    {
        System.out.println("It has a Branch in Tambaram.");
    }
}

public class AbstractMethods
{
    public static void main(String[] args)
    {
        SBI SBIbank = new SBI();
        IndianBank Indianbank = new IndianBank();
        ICICI ICICIbank = new ICICI();
        System.out.println("SBI Bank Details: ");
        SBIbank.NameOfBank();
        SBIbank.RateOfInterests();
        SBIbank.Sector();
        SBIbank.MinimumBalance();
        SBIbank.Branch();
        System.out.println("------------------------------------");
        System.out.println("Indian Bank Details: ");
        Indianbank.NameOfBank();
        Indianbank.RateOfInterests();
        Indianbank.Sector();
        Indianbank.MinimumBalance();
        Indianbank.Branch();
        System.out.println("------------------------------------");
        System.out.println("ICICI Bank Details: ");
        ICICIbank.NameOfBank();
        ICICIbank.RateOfInterests();
        ICICIbank.Sector();
        ICICIbank.MinimumBalance();
        ICICIbank.Branch();
        System.out.println("------------------------------------");
    }
}
