
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5001);
            System.out.println("Server is waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(
                s.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println("Client says: " + msg);

            String response = "Server received: " + msg;

            out.println(response);
            System.out.println("Response sent.");

            s.close();
            ss.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
