package AccessSpecifier1;

public class Demo1
{
    public int num4;

    public Demo1()
    {
        num4=40;
    }
    public void m4()
    {
        System.out.println(num4*num4);
    }


    public static void main(String[] args)
    {
        Demo1 d1=new Demo1();
        d1.m4();
        System.out.println(d1.num4);
    }
}