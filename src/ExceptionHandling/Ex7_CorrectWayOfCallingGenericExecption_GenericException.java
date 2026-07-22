package ExceptionHandling;
public class Ex7_CorrectWayOfCallingGenericExecption_GenericException
{
    public static void main(String[] args) {

        String s1="abcd";

        try
        {
            System.out.println(s1.charAt(7));    //risky code
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException handled");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Generic Exception handled");
        }


        System.out.println("hi");
    }
}