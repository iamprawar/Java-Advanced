package Array;
public class Ex1_CharArray
{
    public static void main(String[] args) {

        char [] ar=new char[5];
        ar[0]='B';
        ar[1]='A';
        ar[2]='E';
        ar[3]='D';
        ar[4]='C';

        System.out.println(ar.length);
        System.out.println(ar[2]);

        System.out.println("-----");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("-----");
        for(char grade:ar)
        {
            System.out.println(grade);
        }

    }
}