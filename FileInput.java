import java.io.FileInputStream;

public class FileInput {

    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("test.txt");
            int i = f.read();
               
            while (i != -1) {
                System.out.print((char) i);
                i = f.read();
            }
             f.close();
        } catch (Exception e) {
            // handle exception
        }
    }
}