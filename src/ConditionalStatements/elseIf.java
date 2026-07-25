
package ConditionalStatements;

public class elseIf {
    public static void main(String[] args) {
        int marks = 32;


        // 32>=65
        if (marks >= 65)      //condition1       //false
        {
            System.out.println("distinction");
        }
        //    32>=60   &  61<65
        else if (marks >= 60 & marks < 65)         //condition2  //false
        {
            System.out.println("1st class");
        }
        //       32>=50  &  50<60
        else if (marks >= 50 & marks < 60)         //condition3   //false
        {
            System.out.println("2nd class");
        }
        //  32>=35   &  40<50
        else if (marks >= 35 & marks < 50)         //condition4   //false
        {
            System.out.println("pass");
        }
        //32<35
        else if (marks < 35)             //condition5  //true
        {
            System.out.println("Fail");
        }

        //true & true -> true
        //true & false -> false
        //false & true -> false
        //false & false -> false
    }
}

