package Utility;

public class BasePortals {

    public static String portalsDEV()
    {
        Portals.dev dev = new Portals.dev();
<<<<<<< HEAD

        String PortalDev=dev.clubswan(); //dev portal link
=======
        String PortalDev=dev.debtboxDv(); //dev portal link
>>>>>>> 2bb7806bdad725ddfff1c887a3020eb02f2cf48d
        String username = "devs";
        String password = "super!power";
        String URLDEV = "https://" + username + ":" + password + "@" + PortalDev;
        return URLDEV;
    }

    public static String portalsTST()
    {
        Portals.tst tst = new Portals.tst();
<<<<<<< HEAD
        String PortalTst = tst.clubswan();//tst portal link
=======
        String PortalTst = tst.debtbox();//tst portal link
>>>>>>> 2bb7806bdad725ddfff1c887a3020eb02f2cf48d
        String username = "sandbox";
        String password = "test!easy";
        String URLTST = "https://" + username + ":" + password + "@" + PortalTst;
        return URLTST;
    }

}
