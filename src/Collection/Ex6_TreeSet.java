package Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex6_TreeSet
{
    public static void main(String[] args) {

        TreeSet tr=new TreeSet();
        tr.add(102);
        tr.add(105);
        tr.add(104);
        tr.add(101);
        tr.add(103);
        tr.add(103);
        tr.add(107);
        tr.add(106);
//        tr.add(null);

        System.out.println(tr);
        System.out.println(tr.size());
        System.out.println(tr.isEmpty());
        System.out.println(tr.contains(104));

        //remove data
        tr.remove(103);
        System.out.println(tr);

        //remove 1st position data
        tr.pollFirst();
        System.out.println(tr);

        //remove last position data
        tr.pollLast();
        System.out.println(tr);

        //get 1st position data
        System.out.println(tr.first());

        //get 1st position data
        System.out.println(tr.last());

        System.out.println("----print all data using for each loop-----");
        for(Object s1:tr)
        {
            System.out.println(s1);
        }

        System.out.println("----print all data using Iterator cursor-----");
        Iterator itr = tr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("----print all data using DescendingIterator cursor-----");
        Iterator ditr = tr.descendingIterator();
        while (ditr.hasNext())
        {
            System.out.println(ditr.next());
        }
    }
}