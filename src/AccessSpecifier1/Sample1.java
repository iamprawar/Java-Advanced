package AccessSpecifier1;

public class Sample1
    //Accessible only in same class i.e. private access specifier
{
    private int num1;     //private access specifier

    private Sample1()   //private access specifier
    {
        num1=10;
    }

    private void m1()       //private access specifier
    {
        System.out.println(num1*num1); //100
    }

    public static void main(String[] args)
    {
        Sample1 s1=new Sample1();
        s1.m1();                   //10
        System.out.println(s1.num1);
    }
}