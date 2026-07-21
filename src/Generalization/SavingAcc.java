package Generalization;
//IC 1
public class SavingAcc implements Generalization.BankAccount
{
    public void CD()
    {
        System.out.println("CD: 3L");
    }

    public void CW()
    {
        System.out.println("CW: 30K");
    }

    public void MT()
    {
        System.out.println("MT: 7L");
    }

    public void newFeatureA()
    {
        System.out.println("New Feature : A");
    }

}