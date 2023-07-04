import proxy_protection.InternetProxy;

public class ProxyProtection {
    public static void main(String[] args) {

        InternetProxy ip = new InternetProxy();
        System.out.println(ip.getResourse("www.facebook.com"));
    }
}
