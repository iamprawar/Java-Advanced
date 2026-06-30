package PolyMorphism;

//Sub/Child class
public class Son extends Father
{
    public void mobile()
    {
        System.out.println("Mobile: Samsung");
    }

    public void car()        //Method Override
    {
        System.out.println("Car: BMW");
    }

    public void money()      //Method Override
    {
        System.out.println("Money: 0.5L");
    }

//    public void home()
//    {
//        System.out.println("Home: 3 BHK");
//    }

}