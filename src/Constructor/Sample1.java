package Constructor;
public class Sample1
{
    //1: Example of default constructor




    //default constructor -> provided by compiler
    //use: to copy all the non-static members(method,variables) of class into object
//    Sample1()
//    {
//
//    }




    public void m1()
    {
        System.out.println("running method m1");
    }


    public static void main(String[] args)
    {
        Sample1 s1=new Sample1();    //default constructor call from same class
        s1.m1();


        //1: Sample1 -> className  -> dataType/objectType
        //2: s1 -> objectName -> use to identify/refer object
        //3: new -> keyword  -> create empty/blank object
        //4: Sample1() -> className() -> constructor call


        System.out.println("------------");


        Sample2 s2 =new Sample2();       //default constructor call from diff/another class
        s2.m2();


    }
}
