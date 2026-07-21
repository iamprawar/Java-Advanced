package ExceptionHandling;

public class Ex1_String
{
    public static void main(String[] args) {

        String s1="abcd";

        try
        {
            System.out.println(s1.charAt(9));    //risky code
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception handled");
        }

        System.out.println("hi");

    }
}