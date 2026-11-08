import java.net.*;

public class URLclassExample2 {
    public static void main(String[] args)
            throws MalformedURLException {
        URL url = URI.create("https://write.abcd.org/2023/06/19/java-url-class-example-2/").toURL();

        String protocol = url.getProtocol();
        System.out.println("Protocol : " + protocol);

        String host = url.getHost();
        System.out.println("HostName : " + host);

        String fileName = url.getFile();
        System.out.println("File Name : " + fileName);
    }
}