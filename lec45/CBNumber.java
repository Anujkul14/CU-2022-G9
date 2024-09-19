package lec45;
import java.util.Scanner;

public class CBNumber {
    static int[] cbPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

    public static boolean isCBNumber(long num) {
        if (num == 0 || num == 1) return false;
        for (int prime : cbPrimes) {
            if (num == prime) return true;
            if (num % prime == 0) return false;
        }
        return true;
    }

    public static int countCBNumbers(String str) {
        int n = str.length();
        boolean[] used = new boolean[n];
        int count = 0;

        for (int length = 1; length <= n; length++) {
            for (int start = 0; start <= n - length; start++) {
                int end = start + length;
                String subStr = str.substring(start, end);
                long num = Long.parseLong(subStr);

                if (isCBNumber(num) && canUse(used, start, end)) {
                    count++;
                    markUsed(used, start, end);
                }
            }
        }
        return count;
    }

    // Function to check if the substring can be used (no overlap)
    public static boolean canUse(boolean[] used, int start, int end) {
        for (int i = start; i < end; i++) {
            if (used[i]) return false;
        }
        return true;
    }

    public static void markUsed(boolean[] used, int start, int end) {
        for (int i = start; i < end; i++) {
            used[i] = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countCBNumbers(str));
    }
}

