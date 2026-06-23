package Constructor;


public class Sample3
{
    //2: Example of user defined constructor


    //1: declaration of variable
    int num1;           //10
    int num2;           //20


    //user defined constructor -> provided by programmer/user
    //use1: initialize global variable
    //use2: to copy all the non-static members(method,variables) of class into object
    Sample3()
    {
        num1=10;
        num2=20;
    }




    public void add()
    {
        System.out.println(num1+num2);  //30
    }


    public void mult()
    {
        System.out.println(num1*num2); //200
    }




    public static void main(String[] args)
    {
        Sample3 s3=new Sample3();          //user defined constructor call from same class
        s3.add();
        s3.mult();
    }
}


