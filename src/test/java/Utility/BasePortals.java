package Utility;

public class BasePortals {

    public static String portalsDEV()
    {
        Portals.dev dev = new Portals.dev();

<<<<<<< HEAD
        String PortalDev="member.dev.auraelifestyle.com/"; //https://dev.neurotrademember.com/

=======
        String PortalDev=dev.plcu(); //dev portal link
>>>>>>> c6c01b960b978f1477abaedb8b41dbc27119fd03
        String username = "devs";
        String password = "super!power";
        String URLDEV = "https://" + username + ":" + password + "@" + PortalDev;
        return URLDEV;
    }

    public static String portalsTST()
    {
<<<<<<< HEAD
        String PortalTst="member.tst.auraelifestyle.com/";//https://sandbox.neurotrademember.com/
=======
        Portals.tst tst = new Portals.tst();
>>>>>>> c6c01b960b978f1477abaedb8b41dbc27119fd03

        String PortalTst = tst.plcu(); //tst portal link
        String username = "sandbox";
        String password = "test!easy";
        String URLTST = "https://" + username + ":" + password + "@" + PortalTst;
        return URLTST;
    }

}
