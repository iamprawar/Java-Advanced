package Array;

public class Ex1_IntArray
{
    public static void main(String[] args) {

        int [] rollNum=new int[4];     //index 0 to 3

        rollNum[0]=30;
        rollNum[1]=10;
        rollNum[2]=40;
        rollNum[3]=20;

        System.out.println(rollNum.length);          //4
        System.out.println(rollNum[2]);               //40

        System.out.println("--print all data---");
        for(int i=0; i<=rollNum.length-1; i++)
        {
            System.out.println(rollNum[i]);
        }

        System.out.println("--print all data using for each loop---");
        for(int num1:rollNum)         //[30, 10, 40, 20]
        {
            System.out.println(num1);
        }





    }
}