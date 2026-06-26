package AccessSpecifier2;


import AccessSpecifier1.Test5;

public class Test7 extends Test5
{

//    protected int num3;
//
//    protected void m3()
//    {
//        System.out.println(num3*num3);
//    }


    public static void main(String[] args)
    {
        Test7 t7=new Test7();
        t7.m3();
        System.out.println(t7.num3);
    }
}