package AbstractClass_And_ConcreteClass;

//incomplete/abstract class
abstract public class Sample1
{

    Sample1()
    {
        System.out.println("running abstract class constructor");
    }

    //complete method
    public void m1()     //method declaration
    {
        System.out.println("method m1 completed in abstract class");         //method definition
    }

    //complete method
    public void m2()     //method declaration
    {
        System.out.println("method m2 completed in abstract class");         //method definition
    }

    //incomplete method
    abstract public void m3();         //method declaration

    //incomplete method
    abstract public void m4();         //method declaration
}