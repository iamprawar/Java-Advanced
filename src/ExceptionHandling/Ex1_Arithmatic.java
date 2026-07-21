package ExceptionHandling;

public class Ex1_Arithmatic
{
    public static void main(String[] args) {

        int num1=10;
        int num2=0;
        int div=0;

        try
        {
            div=num1/num2;    //risky code           //0
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception handled");
        }

        System.out.println(div);                     //0
        System.out.println("Hello");

    }
}