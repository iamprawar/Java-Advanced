package Methods;

public class Sample9
{
    public static void main(String[] args)
    {
        addition(10,20);
        addition(11,12);
        addition(40,45);
    }




    //method with 2 int (int, int) parameter
    public static void addition(int num1, int num2)       //num1=40, num2=45    //variable declaration
    {
        int sum=num1+num2;         //40+45= 85 variable usage
        System.out.println(sum);
    }




//    public static void addition()
//    {
//        int num1=30;
//        int num2=40;
//        int sum=num1+num2;       //10+20=30
//        System.out.println(sum);
//    }




}
