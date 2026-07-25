package PolyMorphism;
public class Ex2_MethodOverriding
{        //Run-time -- diff class inheritance -- same para -- dynamic binding(late)-- achieves runtime polymorphism
    public static void main(String[] args)
    {
        Father f=new Father();
        f.car();
        f.money();
        f.home();

        System.out.println("--------");

        Son s=new Son();
        s.mobile();
        s.car();
        s.money();
        s.home();
    }
}