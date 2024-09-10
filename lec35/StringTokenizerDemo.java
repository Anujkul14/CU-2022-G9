package lec35;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("Belives in Yourself","e");

        while(st1.hasMoreTokens())
        {
            System.out.println(st1.nextToken());
        }

        //tokens will be separated by the single character
        StringTokenizer st2 = new StringTokenizer("Hello World");

        while(st2.hasMoreTokens())
        {
            System.out.println(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer("Hello World"," ",true);
        while(st3.hasMoreTokens())
        {
            System.out.println(st3.nextToken());
        }

    }
}
