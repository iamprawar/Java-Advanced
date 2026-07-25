package Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex3_LinkedList
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        ll.add("ramesh");
        ll.add(101);
        ll.add('B');
        ll.add(92.1f);
        ll.add(null);
        ll.add(101);
        ll.add(null);

        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.contains("ramesh"));
        System.out.println(ll.get(3));

        //update data
        ll.set(0,"RAMESH");
        System.out.println(ll);

        //add data in between linkedlist
        ll.add(4,"abc");
        System.out.println(ll);

        //remove data in between linkedlist
        ll.remove(4);
        System.out.println(ll);

        System.out.println("------print data using for loop---------");
        for(int i=0; i<=ll.size()-1; i++)
        {
            System.out.println(ll.get(i));
        }

        System.out.println("-----print data using for each loop------");
        for(Object s1:ll)
        {
            System.out.println(s1);
        }

        System.out.println("-----print data using Iterator cursor------");
        Iterator itr = ll.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("-----print data using ListIterator cursor------");
        ListIterator listItr = ll.listIterator();
        while (listItr.hasNext())
        {
            System.out.println(listItr.next());
        }

        System.out.println("----");
        ll.clear();
        System.out.println(ll.size());


    }

}