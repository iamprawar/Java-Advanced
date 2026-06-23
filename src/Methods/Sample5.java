


package Methods;
public class Sample5
{
    //4: non-static method call from different/another class
    public static void main(String[] args)
    {
        //1: create object/copy/instance of different/another class
        //2: method call - using objectName.methodName()


        Sample6 s6=new Sample6();             //create object of diff class
        s6.m7();                              //method call -> objName.methodName()
        s6.m8();
        s6.m8();
    }
}









