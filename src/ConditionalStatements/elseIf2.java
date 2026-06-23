package ConditionalStatements;
public class elseIf2
{
    public static void main(String[] args)
    {
        int marks=76;


        // 76>=65
        if(marks>=65)      //condition1      //true
        {
            System.out.println("distinction");
        }
        //    32>=60   &  61<65
        else if(marks>=60  & marks<65)         //condition2  //False
        {
            System.out.println("1st class");
        }
        //       32>=50  &  50<60
        else if(marks>=50 & marks<60)         //condition3  //False
        {
            System.out.println("2nd class");
        }
        //  32>=35   &  40<50
        else if(marks>=35 & marks<50)         //condition4 //False
        {
            System.out.println("pass");
        }
        else           //condition5
        {
            System.out.println("Fail"); //False
        }
    }
}

