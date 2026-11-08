
import java.net.URL;

public class Ass19 {
    public static void main (String a[]) {
        try {
            URL url = new URL(
                "https://www.google.com/search?q=java+programming&oq=java+programming&aqs=chrome..69i57j0i433i512l2j0i512l3j0i433i512j0i512l2.1234j0j7&sourceid=chrome&ie=UTF-8"
            );

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Path: " + url.getPath());
            System.out.println("Query String: " + url.getQuery());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
