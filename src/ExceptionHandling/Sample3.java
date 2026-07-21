package ExceptionHandling;

public class Sample3
{
    public static void main(String[] args) {

        int num1=10;
        int num2=0;

        int num3=num1/num2;     //ArithMeticException //NonDivisible

        System.out.println(num3);
        System.out.println("Hello");

    }
}