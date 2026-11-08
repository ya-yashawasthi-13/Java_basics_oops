
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5001);

            Scanner sc = new Scanner(System.in);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(
                s.getOutputStream(), true);

            System.out.print("Enter message: ");
            String msg = sc.nextLine();

            out.println(msg);

            String response = in.readLine();
            System.out.println("Server response: " + response);

            s.close();
            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
