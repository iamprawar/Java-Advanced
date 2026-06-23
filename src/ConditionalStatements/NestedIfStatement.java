package ConditionalStatements;

public class NestedIfStatement
{
    public static void main(String[] args)
    {
        int PEM=350;  //prelims exam marks


        //350>=300
        if(PEM>=300)      //outer if //False

        {
            System.out.println("Selected in prelim exam");
         System.out.println("preparing for mains exam");



            int MEM=800;  //Mains exam marks
            //800>=800
            if(MEM>=800)         //nested or inner if //True
            {
                System.out.println("Selected in main exam");
            }
            else
            {
                System.out.println("Rejected from main exam");
            }
        }
        else
        {
            System.out.println("Rejected from prelim exam");
        }
    }
}
