package interface_ImpelementationClass;
public class Ex4_TestStatic_And_Private_MethodInInterface
{
    public static void main(String[] args)
    {
        CommonFunctionsClass.captureSS();   //className.methodName()
        CommonFunctionsClass.captureSS();
        CommonFunctionsClass.captureSS();

        CommonFunctions.captureSS();     //InterfaceName.methodName()
        CommonFunctions.getDataFromExcel();
        CommonFunctions.writeDataInExcel();

//        CommonFunctions.getExcelPath()   //no access
    }
}