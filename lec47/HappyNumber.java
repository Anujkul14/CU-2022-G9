package lec47;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 19;  // You can test with any number
        if (isHappy(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }

    }

    public static boolean isHappy(int n)
    {
        Set<Integer> seenNumbers = new HashSet<>();
        //runs a loop and if sum of sqaures is not part of set only then included
        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    // Function to get the sum of the squares of the digits of a number
    private static int getSumOfSquares(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }
}

