import java.io.*;

public class Q1 {
    public static void main(String[] args) throws IOException{
        FileInputStream fin;
        int i;
        try{
            fin = new FileInputStream("source.txt");
        }catch(FileNotFoundException fe){
            System.out.println("No File Exist");
            return;
        }

        do{
            i = fin.read();
            if(i != -1){
                System.out.println((char)i);
            }
        }while(i != -1);
    }
}
