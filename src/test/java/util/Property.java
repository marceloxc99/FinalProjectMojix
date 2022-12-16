package util;

public class Property {
    private static String nameProperty;
    public static String getTestSuiteProperties (){
        nameProperty = "ticktick";

        switch (nameProperty){
            case "ticktick":
                nameProperty = "ticktick.properties";
                break;
            default:
                nameProperty = "Invalid properties";
                break;
        }
        return nameProperty;
    }
}
