package Lec37;

public class reverseStrings {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    static String reverseString(String str) {
        // Write your code here
        String ans = "";
        for(int i = str.length() - 1;i >= 0;i--)
        {
            ans += str.charAt(i);
        }
        return ans;
    }
}
