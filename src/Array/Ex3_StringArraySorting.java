package Array;

import java.util.Arrays;

public class Ex3_StringArraySorting
{
    public static void main(String[] args)
    {
        String [] ar=new String[5];

        ar[0]="mahesh";
        ar[1]="ramesh";
        ar[2]="ganesh";
        ar[3]="suresh";
        ar[4]="naresh";

        System.out.println("---Print String array before sorting---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        Arrays.sort(ar);
        System.out.println("---Print String array after sorting -> Alphabetical order---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

    }
}