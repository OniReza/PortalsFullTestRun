package Utility;

import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;
import Utility.BasePortals;

public class BaseData {


    public static String BaseUrlMain() {

        String PortalDev= BasePortals.portalsDEV();
        String PortalTst= BasePortals.portalsTST();

//        String URL =PortalDev;
        String URL =PortalTst;
        return URL;
    }

    public static String BasePopUpUrl()
    {
        String PortalDev= BasePortals.portalsDEV();
        String PortalTst= BasePortals.portalsTST();

        String PURL = PortalDev;
//        String PURL =PortalTst;
        return PURL;
    }

    public static String BaseEmail(){
<<<<<<< HEAD
          String Email="aurae_us_tst_t7@mailinator.com"; //Neotrade
=======
         // String Email="clubswan_us_tst_rtl_19@mailinator.com"; //Neotrade
          String Email=BaseEmail.BaseEmailList() ; //Neotrade
>>>>>>> c6c01b960b978f1477abaedb8b41dbc27119fd03

          return Email;
    }
    public static String BasePassword(){
        String Password = "Tt123#123#";
        return Password;
    }
    public static String BaseOtp() {
<<<<<<< HEAD
        String secretKey = "7HYQSPH3LT3SHLFO24KS6REV4E";//auri
=======
        String secretKey = BaseOTP.BaseOTPList();//Neotrade
>>>>>>> c6c01b960b978f1477abaedb8b41dbc27119fd03

        String code = getTOTPCode(secretKey);
        return code;

    }
    private static String getTOTPCode(String secretKey) {
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
        String x= TOTP.getOTP(hexKey);
        System.out.println("Totp: "+ TOTP.getOTP(hexKey));
        return TOTP.getOTP(hexKey);
    }
    //Apexx
    public static String cardNumber() {
        String number = "5200000000001005";
        //String number = "4456530000001005";
        return number;
    }
    public static String cardMonth() {
        String month = "11";
        return month;
    }
    public static String cardYear() {
        String year = "31";
        return year;
    }
    public static String cardCvv() {
        String cvv = "003";
        return cvv;
    }

//Stripe
public static String stripeCardNumber() {
    String number = "5555555555554444";
    return number;
}
    public static String stripeCardExpiry() {
        String date = "1130";
        return date;
    }

}
