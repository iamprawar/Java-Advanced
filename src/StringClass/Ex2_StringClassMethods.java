package StringClass;

public class Ex2_StringClassMethods
{
    public static void main(String[] args)
    {               //2
        String s1="abcaba";
        String s2="velocity";
        String s3="abcd";
        String s4="my name is abc";
        String s5=" abcd xyz ";

        System.out.println(s1.indexOf('b'));            //2 //1
        System.out.println(s1.lastIndexOf('b'));    //4
        System.out.println(s2.substring(3));  //ocity
        System.out.println(s2.substring(5,7));         //startIndex, endIndex+1
        System.out.println("-----");                   //blank

        System.out.println(s2+" "+s3);
        System.out.println(s2+s3);           //velocityabcd
        System.out.println(s2.concat(s3));   //velocityabcd
        System.out.println(s4.replace("abc","xyz"));     //my name is abc
        System.out.println("------");
        System.out.println(s5);
        System.out.println(s5.trim());

        String [] ar=s4.split(" ");   //[my(0)     name(1)      is(2)      abc(3)]
        System.out.println(ar[3]);
        System.out.println("----print all words from array---");
        for(String str1:ar)
        {
            System.out.println(str1);
        }
    }
}