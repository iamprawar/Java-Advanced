package Array;
public class Ex7_SwapDataInArray
{
    public static void main(String[] args) {
        int [] ar={103,104,101,102};

        System.out.println("---print original data---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        int temp=ar[0];   //103
        ar[0]=ar[1];      //104
        ar[1]=temp;

        System.out.println("---print data after swaping---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}