package proxy_protection;

public class Tarrasul implements ISP {

    public String getResourse(String url) {

        String res = "";
        if (url.equalsIgnoreCase("www.google.com")) {
            res = "Google Site";
        }
        if (url.equalsIgnoreCase("www.facebook.com")) {
            res = "Facebook Site";
        } else
            res = "Error 404";

        return res;
    }

}
