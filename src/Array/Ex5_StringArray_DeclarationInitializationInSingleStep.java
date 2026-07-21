package Array;
public class Ex5_StringArray_DeclarationInitializationInSingleStep
{
    public static void main(String[] args)
    {
        String [] ar={"mahesh","suresh","ramesh","mahesh","naresh"};

        System.out.println(ar.length);
        System.out.println(ar[1]);

        System.out.println("---print all data --");
        for(String s1:ar)
        {
            System.out.println(s1);
        }
    }
}