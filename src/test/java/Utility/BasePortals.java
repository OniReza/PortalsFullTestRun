package Utility;

public class BasePortals {

    public static String portalsDEV()
    {
        Portals.dev dev = new Portals.dev();
        Portals.tst tst = new Portals.tst();

        String PortalDev=dev.plcu(); //dev portal link
        String username = "devs";
        String password = "super!power";
        String URLDEV = "https://" + username + ":" + password + "@" + PortalDev;
        return URLDEV;
    }

    public static String portalsTST()
    {
        Portals.dev dev = new Portals.dev();
        Portals.tst tst = new Portals.tst();

        String PortalTst = tst.plcu();//tst portal link
        String username = "sandbox";
        String password = "test!easy";
        String URLTST = "https://" + username + ":" + password + "@" + PortalTst;
        return URLTST;
    }

}
