package StringClass;

public class Ex1_StringClassMethods
{
    public static void main(String[] args)
    {
        String s1="velocity";
        String s2="ABCD";   //CAP
        String s3="abcd";   //SMALL
        String s4="my name is xyz";
        String s5=" ";

        System.out.println(s1.length());   //8

//        s1=s1.toUpperCase();
        System.out.println(s1.toUpperCase());   //VELOCITY
        System.out.println(s1);

//        s2=s2.toLowerCase();
        System.out.println(s2.toLowerCase());
        System.out.println(s2);
        System.out.println("--------");

        System.out.println(s2.equals(s3));                // false   //compare date & case
        System.out.println(s2.equalsIgnoreCase(s3));      // true    //compare only date & ignore case
        System.out.println(s4.contains("xyz"));
        System.out.println(s4.startsWith("my"));
        System.out.println(s4.endsWith("xyz"));

        System.out.println("-------");

        System.out.println(s1.isEmpty());     //false
        System.out.println(s5.isEmpty());     //true     //read space char
        System.out.println(s5.isBlank());                //ignore space char
        System.out.println(s1.charAt(7));      //y

        System.out.println("------");






    }
}