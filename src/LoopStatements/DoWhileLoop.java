package LoopStatements;

public class DoWhileLoop {

    public static void main(String[] args) {

        //syntax


        int  i=1;  //1   //startNum

        do{
            System.out.println(i); //1 2 //statement
            i++; //2 3

        }
        while(i<=5); //2<=5 - true  //1 2 3 4 5       // inc/dec

        System.out.println("loop completed");

    }
}