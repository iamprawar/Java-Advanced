package TypesOfvariables;
public class Sample6
{
    //3: Example of non-static global variable


    int num3 = 30;    //non-static global variable


    public static void main(String[] args)
    {
        //1: non-static global variable call from same class
        Sample4 s4=new Sample4();            //1: create object of same class
        System.out.println(s4.num3);         //2: variable call -> sameClassObjectName.variableName //30


        //2: non-static global variable call from diff class
        Sample5 s6=new Sample5();         //1:create object of diff class
        System.out.println(s6.num4);      //2: variable Call -> diffClassObjectName.variableName //40
    }




    public static void m5()
    {
        Sample4 s5=new Sample4();
        System.out.println(s5.num3);
    }


    public void m6()
    {
        System.out.println(num3);
    }
}


