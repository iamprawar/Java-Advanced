package TypesOfvariables;
public class Sample1
{
    //1: example of local & global variable


    int num3=30;     //global variable


    public void m1()
    {
        int num1=10;             //local variable
        System.out.println(num1);    //calling local variable
        System.out.println(num3);    //calling global variable
    }


    public void m2()
    {
        int num2=20;             //local variable
        System.out.println(num2);        //call local variable
//        System.out.println(num1);
        System.out.println(num3);        //call global variable
    }


    public static void main(String[] args)
    {
        Sample1 s1=new Sample1();
        s1.m1();
        s1.m2();
    }
}


