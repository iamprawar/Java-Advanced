package Methods;
public class Sample7
{
//5: without parameter method (method with 0 parameter)


    public static void main(String[] args)
    {
        //1: static method call from same class
        m1();              //methodName()


        //2: static method call from diff class
        //Sample8.m2();       //className.methodName()




        //3: non-static method call from same class
        Sample7 s1=new Sample7();       //1: create object of same class
        s1.m3();                        //2: method call -> objName.methodName()


        //4: non-static method call from diff class
       // Sample8 s2=new Sample8();       //1: create object of diff class
       // s2.m4();                        //2: method call -> objName.methodName()
    }


    //method without/zero parameter
    public static void m1()
    {
        System.out.println("running static regular method-m1 from same class");
    }


    //method without/zero parameter
    public void m3()
    {
        System.out.println("running non-static regular method-m3 from same class");
    }
}

