import java.io.FileOutputStream;
public class FileOutput {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("test.txt");
            f.write(65); //A
            f.close();
        } catch (Exception e) {
            // handle exception
        }
    }
}
