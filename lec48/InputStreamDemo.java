package lec48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fos = new FileOutputStream("G9.txt");
            String sentences = "G9,Chitkara University,Rajpura";
            fos.write(sentences.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try
        {
            FileInputStream fis = new FileInputStream("G9.txt");
            while(fis.read() != -1)//-1 end of the file reached
            {
                System.out.println((char)fis.read());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
