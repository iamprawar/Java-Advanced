package Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex5_LinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("amol");
        lhs.add(101);
        lhs.add(65.1f);
        lhs.add('A');
        lhs.add(null);
        lhs.add(101);
        lhs.add(null);

        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains(101));

        //remove data
        lhs.remove('A');
        System.out.println(lhs);

        System.out.println("-----print data using for each loop---");
        for(Object s1:lhs)
        {
            System.out.println(s1);
        }

        System.out.println("-----print data using Iterator cursor---");
        Iterator itr = lhs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("---");
        lhs.clear();
        System.out.println(lhs.size());
    }
}