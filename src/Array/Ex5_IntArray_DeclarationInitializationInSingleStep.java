package Array;
public class Ex5_IntArray_DeclarationInitializationInSingleStep
{
    public static void main(String[] args)
    {
        int [] ar={40,10,50,30,20};

        System.out.println(ar.length);   //5
        System.out.println(ar[3]);

        System.out.println("-----print all data from int array----");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println("----");
        for(int num:ar)
        {
            System.out.println(num);
        }
    }
}