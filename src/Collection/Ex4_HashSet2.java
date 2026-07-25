package Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class Ex4_HashSet2
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("Amol");
        al.add(101);
        al.add('A');
        al.add(78.4f);
        al.add(null);
        al.add(101);
        al.add(null);
        System.out.println(al);

        HashSet hs=new HashSet(al);
        System.out.println(hs);
    }
}