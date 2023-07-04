package proxy_protection;

import java.util.ArrayList;

public class InternetProxy implements ISP {

    private ArrayList<String> blockedSites;
    private Tarrasul isp;

    public InternetProxy() {
        blockedSites = new ArrayList<>();
        isp = new Tarrasul();
        blockedSites.add("www.google.com");
    }

    public void blockSite(String url) {
        blockedSites.add(url);
    }

    public boolean isBlocked(String url) {
        return blockedSites.contains(url);
    }

    public String getResourse(String url) {
        if (isBlocked(url))
            return "Blocked Website";

        else
            return isp.getResourse(url);
    }
}
