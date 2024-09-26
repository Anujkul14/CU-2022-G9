package lec48;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) {
        File file = new File("G9.txt");
        if(!file.exists())
        {
            System.out.println("file not exist");
        }
        try
        {
            if(file.createNewFile())
            {
                System.out.println("File Created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
