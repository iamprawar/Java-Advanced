package     ExceptionHandling;

public class Ex10_finallyBlock
{
    public static void main(String[] args) {

        String s1="abcd";

        try
        {
            System.out.println(s1.charAt(9));    //risky code
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        finally
        {
            System.out.println("running finally block");
        }



        System.out.println("Hi");


    }
}

// Finally.Test();
// Finally is a block in java exception handling to execute the important code
// weather the exception is occurs or not
