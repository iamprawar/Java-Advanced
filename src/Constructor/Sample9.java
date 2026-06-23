

package Constructor;


public class Sample9
{
    //3: user defined with parameter constructor


    int num1;   //40
    int num2;   //30




    //user defined with 2 int(int, int) parameter constructor
    //use1: initialize global variable
    //use2: to copy all the non-static members(method,variables) of class into object
    Sample9(int a, int b)      //a=40, b=30 //variable declaration
    {
        num1=a;        //globalVariable=localVariable   -> assigning local variable info into global variable
        num2=b;
    }


    public void add()
    {
        System.out.println(num1+num2);
    }


    public void mult()
    {
        System.out.println(num1*num2);
    }




    public static void main(String[] args)
    {
        Sample5 s5=new Sample5(10,20);         //variable initialization
        s5.add();
        s5.mult();


        System.out.println("--");
        Sample5 s6=new Sample5(40,30);
        s6.add();
        s6.mult();




        System.out.println("--");
        Sample5 s7=new Sample5(100,30);
        s7.add();
        s7.mult();


    }




}
