package Variables;
public class Test1
{
    public static void main(String[] args) {


        // 1. Variable declaration (Allocating/Reserving memory)
        String sname;                //dataType variableName
        String sdept;
        int srollnum;
        float sper;
        char sgrade;


        //  2. Variable Initialization (Assigning or Inserting value)
        sname="Sushma";                         //variableName="variableValue"
        sdept="Computer";
        srollnum=101;
        sper=60.3f;
        sgrade='A';


        // 3. Variable Usage
        System.out.println("Student Name: "+sname);
        System.out.println("Student Department: "+sdept);
        System.out.println("Student Roll Num: "+srollnum);
        System.out.println("Student Percentage: "+sper +"%");
        System.out.println("Student Grade: "+sgrade);
    }
}
