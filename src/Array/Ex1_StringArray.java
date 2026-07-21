package Array;

public class Ex1_StringArray
{
    public static void main(String[] args)
    {
        //1: Array Declaration
        String [] ar=new String[5];

        //2: Array Initialization
        ar[0]="mahesh";
        ar[1]="ramesh";
        ar[2]="ganesh";
        ar[3]="suresh";
        ar[4]="naresh";
//        ar[5]="jkcncnc";           InValid Index-ArrayIndexOutOfBoundsException

        //3: Array Usage
        System.out.println(ar[2]);         //ganesh
        System.out.println(ar.length);     //5

        System.out.println("-----print all data from string array-----");
        //           5<=4
        for(int i=0; i<=4; i++)
        {                      //4
            System.out.println(ar[i]);      //mahesh ramesh ganesh suresh naresh
        }

        System.out.println("--");

        for(int i=0; i<=ar.length-1; i++)
        {                      //4
            System.out.println(ar[i]);      //mahesh ramesh ganesh suresh naresh
        }

    }
}