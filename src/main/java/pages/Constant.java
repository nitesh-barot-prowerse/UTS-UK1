package pages;

import java.util.Random;

public class Constant {
    public static  String ENVIRONMENT=System.getProperty("environment");

    public static String url;
    static {
        if(ENVIRONMENT.equals("UTS_UK1_Stage")){
            url="http://52.32.106.250:8888/";
        } else if (ENVIRONMENT.equals("UTS-UK1production")) {
            url="https://fitlocal.britishpetinsurance.co.uk:93/";
        } else if (ENVIRONMENT.equals("UTS-user")) {
            url="http://stagingportal.britishpetinsurance.co.uk:9090/exotic-quote-form";

        }

    }

    protected static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    protected static String getAlphaNumericString()
    {

        // choose a Character random from this String
        String AlphaNumericString = "0123456789";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 11; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}
