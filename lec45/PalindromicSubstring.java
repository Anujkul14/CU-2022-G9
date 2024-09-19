package lec45;
import java.util.Scanner;

public class PalindromicSubstring {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true; // It's a palindrome
    }

    public static int countPalindromicSubstrings(String str) {
        int count = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String subStr = str.substring(i, j);

                if (isPalindrome(subStr)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(countPalindromicSubstrings(S));
    }
}