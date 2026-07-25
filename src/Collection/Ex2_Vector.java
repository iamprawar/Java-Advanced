package Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex2_Vector
{
    public static void main(String[] args) {

        Vector V=new Vector();
        V.add("Amol");
        V.add(101);
        V.add('A');
        V.add(78.4f);
        V.add(null);
        V.add(101);
        V.add(null);

        System.out.println(V);
        System.out.println(V.size());  //7
        System.out.println(V.capacity());  //

        System.out.println(V.isEmpty());    //false
        System.out.println(V.contains("Amol"));
        System.out.println(V.get(2));

        //update data
        V.set(2,'B');
        System.out.println(V);

        //Add data in between vector  -> right shift operation
        V.add(3,200);
        System.out.println(V);

        //remove data in between vector  -> left shift operation
        V.remove(3);
        System.out.println(V);


        System.out.println("-----print data from vector using for loop----");
        for(int i=0; i<=V.size()-1; i++)
        {
            System.out.println(V.get(i));        // Amol 101 B
        }

        System.out.println("-----print data from vector using for each loop----");
        for(Object s1:V)
        {
            System.out.println(s1);
        }

        System.out.println("-----print data from vector using Iterator cursor----");
        //1: copy all the data from vector object into Iterator object
        Iterator itr = V.iterator();     //[Amol, 101, B, 78.4, null, 101, null]

        //2: get 1 by 1 by data from Iterator Object
        while(itr.hasNext())    //true/false -> fVse
        {
            System.out.println(itr.next());
        }

        System.out.println("-----print data from vector using ListIterator cursor----");
        //1: copy Vl the data from vector object into ListIterator object
        ListIterator litr = V.listIterator();

        //2: get 1 by 1 by data from ListIterator Object
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("-----print data from vector using Enumeration cursor----");
        //1: copy all the data from vector object into Enumeration object
        Enumeration enu = V.elements();

        //2: get 1 by 1 by data from ListIterator Object
        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
        }


        System.out.println("---");
        V.clear();
        System.out.println(V.size());

    }
}