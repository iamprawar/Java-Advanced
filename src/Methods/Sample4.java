package Methods;

public class Sample4
{



    public static void main(String[] args)
    {
        //1: create object/copy/instance of same class
        //2: method call - using objectName.methodName()
        //3: non-static method call from same/current class

        //  className objectName=new className();              -> Syntax of object Creation
        Sample4 s4 = new Sample4();
        s4.m5();
        s4.m6();
        s4.m6();


        //1: Sample4  -> className  -> as a dataType
        //2: s4 -> objectName -> use to identify/refer object
        //3: new -> keyword -> use to create blank/empty object
        //4: Sample4() -> className()  -> constructor  -> use to copy all the non-static members into object
    }


    //non-static regular ->regular method
    public void m5()
    {
        System.out.println("running non-static regular method m5 from same class");
    }


    //non-static regular ->regular method
    public void m6()
    {
        System.out.println("running non-static regular method m6 from same class");
    }
}
