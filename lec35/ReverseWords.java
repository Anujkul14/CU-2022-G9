package lec35;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        String s1;
        Scanner sc = new Scanner(System.in);
//        s1 = sc.next();
//        System.out.println(s1);

        String s2 = sc.nextLine();
        System.out.println(s2);

        reverseWords(s2);

    }

    //the sky is blue
    //blue is sky the
    public static String reverseWords(String s)
    {
       s = s.trim();
       String[] arr = s.split("\s+");
       String ans = "";
       for(int i = arr.length - 1;i >= 0;i--)
       {
           ans += arr[i] + " ";
       }
       return ans.trim();

    }
}
