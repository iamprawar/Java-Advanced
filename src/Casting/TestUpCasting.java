package Casting;

public class TestUpCasting
{

    public static void main(String[] args)
    {
//        Son s=new Son();
//        s.mobile();
//        s.car();
//        s.money();
//        s.home();


//        Create Objet of sub class with reference/DataType of super class
        Father  F= new Son();          //-> syntax of Object creation
        F.car();
        F.money();
        F.home();


    }
}