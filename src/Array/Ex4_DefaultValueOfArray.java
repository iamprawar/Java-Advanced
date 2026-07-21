package Array;
public class Ex4_DefaultValueOfArray
{
    public static void main(String[] args) {

        System.out.println("-----String array------");
        String [] ar=new String[5];
        ar[0]="abc";
        ar[1]="xyz";
        for(String s1:ar)
        {
            System.out.println(s1);
        }

        System.out.println("--int array---");
        int [] ar1=new int[4];
        ar1[0]=78;
        for(int num:ar1)
        {
            System.out.println(num);
        }
    }
}