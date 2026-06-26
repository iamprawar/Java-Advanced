package AccessSpecifier1;

public class Test5
{
    protected int num3;

    protected Test5()
    {
        num3=30;
    }

    protected void m3()
    {
        System.out.println(num3*num3);
    }


    public static void main(String[] args)
    {
        Test5 t5=new Test5();
        t5.m3();
        System.out.println(t5.num3);
    }

}