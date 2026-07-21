package Array;
import java.util.Arrays;

public class Ex6_FindSmallest_And_HighestNumberInIntArray
{
    public static void main(String[] args)
    {
        int [] ar={40,10,50,30,20};

        Arrays.sort(ar);     //{10,20,30,40,50}

        System.out.println(ar[0]);
        System.out.println(ar[ar.length-1]);


    }
}