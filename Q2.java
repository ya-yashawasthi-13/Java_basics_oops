import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("source.txt");
             FileOutputStream fout = new FileOutputStream("Destination.txt")) {
            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("No File Exist");
        } catch (IOException ie) {
            System.out.println("No IO");
        }
    }
}
  