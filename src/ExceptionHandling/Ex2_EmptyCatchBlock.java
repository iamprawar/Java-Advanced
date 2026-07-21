package ExceptionHandling;

public class Ex2_EmptyCatchBlock
{
    public static void main(String[] args) {

        String s1="abcd";

        try
        {
            System.out.println(s1.charAt(8));    //risky code
        }
        catch (StringIndexOutOfBoundsException e)
        {

        }

        System.out.println("hi");

    }
}