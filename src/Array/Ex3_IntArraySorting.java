package Array;
import java.util.Arrays;

public class Ex3_IntArraySorting
{
    public static void main(String[] args) {

        int [] ar=new int[4];     //index 0 to 3
        ar[0]=30;     //10
        ar[1]=10;     //20
        ar[2]=40;     //30
        ar[3]=20;     //40

        System.out.println("--print original data: before sorting--");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        Arrays.sort(ar);      //{10, 20, 30, 40}              //diffClassName.methodName(ArrayObjName)
        System.out.println("--print array in ascending order--");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("--print array in descending order--");
        for(int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);
        }

    }
}