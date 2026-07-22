package ExceptionHandling;

public class Ex8_HandlingMultipleExceptions
{
    public static void main(String[] args)
    {
        String s1="abcd";
        try
        {
            System.out.println(s1.charAt(8));    //risky code
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        System.out.println("Hi");

        int [] ar={90,40,80,10};
        try
        {
            System.out.println(ar[8]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException e");
        }

        System.out.println("Hello");


    }
}