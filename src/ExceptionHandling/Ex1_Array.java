package ExceptionHandling;

public class Ex1_Array
{
    public static void main(String[] args)
    {
        int [] ar={10,40,30,20};

        try
        {
            System.out.println(ar[9]);     //risky code
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception handled");
        }

        System.out.println("hi");
        System.out.println("Hello");

    }
}