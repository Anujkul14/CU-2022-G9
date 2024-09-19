package lec46;

import java.util.Scanner;
public class ValidEmailAddress {
    public static void main(String[] args)
    {
        String id;
        Scanner s1 = new Scanner(System.in);
        id = s1.nextLine();

        try {
            int atIndex = id.indexOf("@");
            int dotIndex = id.lastIndexOf(".");

            if (atIndex == -1 || dotIndex == -1 || dotIndex < atIndex) {
                throw new Exception("Invalid");
            }

            System.out.println("Valid");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

