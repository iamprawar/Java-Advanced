package LogicalProgram;
import java.util.Scanner;

public class Ex8_AcceptInputFromUser_Int
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Num1:");
        int num1=scan.nextInt();            //accept int input from user

        System.out.print("Enter Num2:");
        int num2=scan.nextInt();

        System.out.println(num1+num2);


        float per = scan.nextFloat();    // use to accept float input from user
    }
}