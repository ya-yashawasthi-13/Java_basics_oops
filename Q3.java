import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException{
        FileInputStream fin;
        FileOutputStream fout;
        int i;

        try{
            fin = new FileInputStream(args[0]);
        }catch(FileNotFoundException fe){
            System.out.println("File Not Found");
            return;
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("No Input");
            return;
        }

        try{
            fout = new FileOutputStream(args[1]);
        }catch(FileNotFoundException fe){
            System.out.println("File Not Found");
            return;
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("No Input");
            return;
        }

        try{
            do{
                i = fin.read();
                if(i != -1){
                    fout.write(i);
                }
            }while(i != -1);
        }catch(IOException ie){
            System.out.println("No IO");
        }
    }
}
