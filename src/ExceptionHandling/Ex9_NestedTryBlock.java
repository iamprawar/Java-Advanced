package ExceptionHandling;
public class Ex9_NestedTryBlock
{
    public static void main(String[] args)
    {
        String s1="abcd";
        int [] ar={90,40,80,10};

        try            //outer try block
        {
            try                  //inner or nested try block
            {
                System.out.println(s1.charAt(8));    //risky1 code
            }
            catch (StringIndexOutOfBoundsException e)
            {
                System.out.println("StringIndexOutOfBoundsException handled");
            }
            System.out.println(ar[8]);              //risky code2
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }

        System.out.println("Hello");
    }
}