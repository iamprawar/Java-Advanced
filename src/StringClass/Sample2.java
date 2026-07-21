package StringClass;

public class Sample2
{

    public static void main(String[] args) {

        //5: Object Creation of String
        //1: without using new keyword
        String s1="abc";

        //2: Using new keyword
        String s2=new String("xyz");


        //6: object creation while
        //1: only declaration of string
        String s3;

        //2: declaration & initialization of string
        String s4="abcd";


        //7: String Objects are immutable  //unchangeable
        String s5="abc";
        s5=s5+"xyz";    //abc+xyz= abcxyz

        s5=s5+"cd";    //abcxyz + cd = abcxyzcd


        //String pool area
        //1: constant pool area (object creation of string without new keyword)
        String s6="abc";
        String s7="abc";
        String s8="abc";
        String s9="abc1";

        //2: non-constant pool area (object creation of string using new keyword)
        String s10=new String("abc");
        String s11=new String("abc");
        String s12=new String("abc1");


        System.out.println(s6==s7);       //true
        System.out.println(s6==s9);       //false
        System.out.println(s6==s10);      //false ==diff memory allocation/location
        System.out.println(s10==s11);     //false


    }
}