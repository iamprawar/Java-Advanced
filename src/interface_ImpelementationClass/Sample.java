package interface_ImpelementationClass;
//implementation class or sub class
public class Sample implements I1, I2
{
    //Example of multiple inheritance using interface

    public void m1()
    {
        System.out.println(I1.num);
        System.out.println(I2.num);
        System.out.println("method m1 from I1 completed in IC");
    }

    public void m2()
    {
        System.out.println("method m2 from I1 completed in IC");
    }

    public void m3()
    {
        System.out.println("method m3 from I2 completed in IC");
    }

    public void m4()
    {
        System.out.println("method m4 from I2 completed in IC");
    }

}