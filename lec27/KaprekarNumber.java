package lec27;
import java.util.Scanner;


public class KaprekarNumber {
    public static boolean isKaprekar(int n) {
        if (n == 1) {
            return true;
        }

        int sq = n * n;

        int digits = (int) Math.log10(sq) + 1;

        for (int d = 1; d < digits; d++) {
            int div = (int) Math.pow(10, d);
            int left = sq / div;
            int right = sq % div;
            if (left + right == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }

}
