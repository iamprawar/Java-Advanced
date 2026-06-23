
package ConditionalStatements;
public class NestedIfStatement2
{


    public static void main(String[] args)
    {
        String UN="abc";    //UserName
        String PWD="xyz";   //Password


        //abc==abc
        if(UN=="abc")       //outer if //True
        {
            System.out.println("correct UN entered");


            //xyz==xyz
            if(PWD=="xyz")    //inner if   //True
            {
                System.out.println("correct PWD entered");
            }
            else
            {
                System.out.println("Wrong PWD entered");
            }
        }
        else
        {
            System.out.println("wrong UN entered");
        }


    }
}
