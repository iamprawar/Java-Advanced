package ExceptionHandling;

public class Ex3_AlternateSolutionInCatchBlock
{
    public static void main(String[] args) {

        String s1="abcd";

        try
        {
            System.out.println(s1.charAt(9));    //risky code
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println(s1.charAt(0));    //alternate code
        }

        System.out.println("hi");

    }
}