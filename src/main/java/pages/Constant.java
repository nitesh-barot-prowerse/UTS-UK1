package pages;

public class Constant {
    public static  String ENVIRONMENT=System.getProperty("environment");

    public static String url;
    static {
        if(ENVIRONMENT.equals("UTS_UK1_Stage")){
            url="http://52.32.106.250:8888/";
        } else if (ENVIRONMENT.equals("UTS-UK1production")) {
            url="https://fitlocal.britishpetinsurance.co.uk:93/";
        }

    }
}
