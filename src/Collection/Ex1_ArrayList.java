package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex1_ArrayList
{
    public static void main(String[] args) {

//        ArrayList al=new ArrayList();                      //initial/default capacity=10
        ArrayList al=new ArrayList(20);         //initial capacity=20
        al.add("Amol");
        al.add(101);
        al.add('A');
        al.add(78.4f);
        al.add(null);
        al.add(101);
        al.add(null);


        System.out.println(al);
        System.out.println(al.size());

        System.out.println(al.isEmpty());    //false
        System.out.println(al.get(2));

        //update data
        al.set(2,'B');
        System.out.println(al);

        //Add data in between arraylist  -> right shift operation
        al.add(3,200);
        System.out.println(al);

        //remove data in between arraylist  -> left shift operation
        al.remove(3);
        System.out.println(al);


        System.out.println("-----print data from arraylist using for loop----");
        //           2<=6
        for(int i=0; i<=al.size()-1; i++)
        {      //                     1
            System.out.println(al.get(i));        // Amol 101 B
        }

        System.out.println("-----print data from arraylist using for each loop----");
        for(Object s1:al)
        {
            System.out.println(s1);
        }

        System.out.println("-----print data from arraylist Iterator cursor----");
        //1: copy all the data from arraylist object into Iterator object
        Iterator itr = al.iterator();     //[Amol, 101, B, 78.4, null, 101, null]

        //2: get 1 by 1 by data from Iterator Object
        while(itr.hasNext())    //true/false -> false
        {
            System.out.println(itr.next());
        }

        System.out.println("-----print data from arraylist ListIterator cursor----");
        //1: copy all the data from arraylist object into ListIterator object
        ListIterator litr = al.listIterator();

        //2: get 1 by 1 by data from ListIterator Object
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }



    }
}