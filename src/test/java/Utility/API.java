package Utility;

import de.taimos.totp.TOTP;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class API {

    public static class CurrencyExchangeRate {
        public static double ToUSD ;
        public static double ToEuro ;
        public static double ToGBP;
        public static double ToJPY;
        public static double ToCNY;

        public static void getRate() throws Exception {
            String secretKey="V4TMHG53QFYHQNPAH3C75VOVHM";

            String fromCurrency=UserProfile.planCurrency;
            String[] toCurrency={"USD","EUR","GBP","JPY","CNY"};
            double[] trate = new double[toCurrency.length];

            //CSRF API Call
            RestAssured.baseURI="https://api.dev.auws.cloud";
            Response response=given().headers(
                            "Content-Type",
                            ContentType.JSON,
                            "Accept",
                            ContentType.JSON)
                    .when().get("/v2/auth/csrf")
                    .then().assertThat().statusCode(200).body("status",equalTo ("success"))
                    .extract().response();
            String bearerToken=response.getBody().path("data.csrfToken.token");

            //Login API Call
            RestAssured.baseURI = "https://api.dev.auws.cloud";
            Response response2=given().headers(
                            "Authorization",
                            "Bearer " + bearerToken,
                            "Content-Type",
                            ContentType.JSON,
                            "Accept", ContentType.JSON)
                    .body("{\r\n"
                            + "    \"email\": \"nahid.clubswan@mailinator.com\",\r\n"
                            + "    \"password\": \"Tt123#123#\",\r\n"
                            + "    \"brand\": \"ClubSwan\"\r\n"
                            + "}")
                    .when().post("/v2/auth/login")
                    .then().extract().response();
            String confirmToken=response2.getBody().path("data.confirmToken.token");

            //Confirmation 2FA
            String code=getTOTPCode(secretKey);
            RestAssured.baseURI = "https://api.dev.auws.cloud";
            Response response3=given().headers(
                            "Authorization",
                            "Bearer " + confirmToken,
                            "Content-Type",
                            ContentType.JSON,
                            "Accept", ContentType.JSON)
                    .body("{\r\n"
                            + "    \"secretCode\": \""+code+"\"\r\n"
                            + "}")
                    .when().post("/v2/auth/device/confirm")
                    .then().extract().response();
            String accessToken=response3.getBody().path("data.accessToken.token");


            //Get conversion rate
            RestAssured.baseURI="https://api.dev.auws.cloud";
            String baseUrl = "/v1/fx/rate/";

            for (int i=0;i<toCurrency.length;i++) {
                String encodedFromCurrency = URLEncoder.encode(fromCurrency, StandardCharsets.UTF_8.toString());
                String encodedToCurrency = URLEncoder.encode(toCurrency[i], StandardCharsets.UTF_8.toString());
                String finalUrl = baseUrl + "" + encodedFromCurrency + "/" + encodedToCurrency;
                Response response4 = given().headers(
                                "Authorization",
                                "Bearer " + accessToken,
                                "Content-Type",
                                ContentType.JSON,
                                "Accept", ContentType.JSON)
                        .when().get(finalUrl)
                        .then().extract().response();
                String rate = response4.getBody().path("data.rate").toString();
                Double conversionRate = Double.valueOf(rate);
                trate[i]= conversionRate;
                System.out.println("Convertion Rate " + fromCurrency + " To " + toCurrency[i] + " : " + conversionRate);
                ToUSD = trate[0];
                ToEuro = trate[1];
                ToGBP = trate[2];
                ToJPY = trate[3];
                ToCNY = trate[4];


            }

            System.out.println("ToUSD "+ToUSD);
            System.out.println("ToEuro "+ToEuro);
            System.out.println("ToEuro "+ ToGBP);
            System.out.println("ToJPY "+ ToJPY);
            System.out.println("ToCNY "+ToCNY);
        }


        private static String getTOTPCode(String secretKey) {
            Base32 base32 = new Base32();
            byte[] bytes = base32.decode(secretKey);
            String hexKey = Hex.encodeHexString(bytes);
            String x= TOTP.getOTP(hexKey);
            //System.out.println("Totp: "+ TOTP.getOTP(hexKey));
            return TOTP.getOTP(hexKey);
        }


//        public void rates() {
//            String url = null;
//            if (planCurrency.equals("USD")) {
//                String fromUSD = "https://api.exchangerate-api.com/v4/latest/USD";
//                url=fromUSD;
//            }
//            else if (planCurrency.equals("Euro")) {
//                String fromEuro = "https://api.exchangerate-api.com/v4/latest/EUR";
//                url=fromEuro;
//            }
//            else if (planCurrency.equals("GBP")) {
//                String fromEuro = "https://api.exchangerate-api.com/v4/latest/GBP";
//                url=fromEuro;
//            }
//            try {
//                URL obj = new URL(url);
//                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//                con.setRequestMethod("GET");
//                int responseCode = con.getResponseCode();
//                if (responseCode == HttpURLConnection.HTTP_OK) {
//                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//                    String inputLine;
//                    StringBuilder response = new StringBuilder();
//                    while ((inputLine = in.readLine()) != null) {
//                        response.append(inputLine);
//                    }
//                    in.close();
//                    JSONObject myResponse = new JSONObject(response.toString());
//                    double usdTousd = myResponse.getJSONObject("rates").getDouble("USD");
//                    ToUSD = usdTousd;
//                    double usdToEur = myResponse.getJSONObject("rates").getDouble("EUR");
//                    ToEuro = usdToEur;
//                    double usdToGbp = myResponse.getJSONObject("rates").getDouble("GBP");
//                    ToGBP = usdToGbp;
//                    double usdToJpy = myResponse.getJSONObject("rates").getDouble("JPY");
//                    ToJPY =usdToJpy;
//                    double usdToCny = myResponse.getJSONObject("rates").getDouble("CNY");
//                    ToCNY = usdToCny;
//                    System.out.println(planCurrency+" to EUR: " + usdToEur);
//                    System.out.println(planCurrency+" to USD: " + usdTousd);
//                    System.out.println(planCurrency+" to GBP: " + usdToGbp);
//                    System.out.println(planCurrency+" to JPY: " + usdToJpy);
//                    System.out.println(planCurrency+" to CNY: " + usdToCny);
//                } else {
//                    System.out.println("GET request not worked");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
    }
}
