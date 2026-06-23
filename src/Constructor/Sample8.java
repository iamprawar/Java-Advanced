package Constructor;


public class Sample8
{
    //1: declare variable globally
    int num3;    //30
    int num4;    //40


    //use1: Initialize global variable
    //use2: copy all the non-static members of class into object
    Sample8()        //without/zero parameter constructor
    {
        num3=30;
        num4=40;
    }




    public void sub()
    {
        System.out.println(num3-num4);
    }


    public void div()
    {
        System.out.println(num3/num4);
    }
}


