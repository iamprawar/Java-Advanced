package TypesOfvariables;
public class Sample2
{
    //2:  example of static/class variable


    static int num1=10;     //static global variable




    public static void main(String[] args)
    {
        //static global variable call from same class
        System.out.println(num1);             //variableName


        //static global variable call from diff class
        System.out.println(Sample3.num2);       //diffClassName.variableName
    }


    public static void m3()
    {
        System.out.println(num1);             //variableName
    }


    public void m4()
    {
        System.out.println(num1);             //variableName
    }


}


