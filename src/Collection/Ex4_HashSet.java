package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex4_HashSet
{
    public static void main(String[] args)
    {
        HashSet hs=new HashSet();
        hs.add("Amol");
        hs.add(101);
        hs.add(65.1f);
        hs.add('A');
        hs.add(null);
        hs.add(101);
        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(101));

        //remove data
        hs.remove('A');
        System.out.println(hs);

        System.out.println("----print data using for each loop----");
        for(Object s1:hs)
        {
            System.out.println(s1);
        }

        System.out.println("----print data using Iterator----");
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("---");
        hs.clear();
        System.out.println(hs.size());

    }
}