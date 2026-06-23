package Methods;

public class Sample1 {
    //   1. static regular method call from same
     //  class  --> methodName();


       //main method
    public static void main(String[] args) {
        System.out.println("Main method started"); //Method calling from diff
        m1();              //method call ->
        methodName();
        m1();
        m2();

        System.out.println("main method ended");

    }

    private static void methodName() {
    }

    //Static regular method
    public static void m1()
    {
        System.out.println("Running method m1");

    }
    //Static->regular method
    public static void m2()
    {
        System.out.println("Running method m2");
    }
}
