import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputExample {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {

            inputStream = new FileInputStream("C:\\Users\\Andrew\\Documents\\TMP.txt");
            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.print("" + c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
        }
    }
}
