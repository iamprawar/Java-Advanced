package S3_Collection;
import java.util.ArrayList;

public class Ex7_generic
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("amol");
        al.add("mahesh");
        al.add("suresh");
        al.add("amol");

        for(String s1:al)
        {
            System.out.println(s1);
        }
    }
}