package lec45;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FormBiggestNumber {
    private static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String x, String y) {
            return (y + x).compareTo(x + y);
        }
    }

    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, new CustomComparator());

        if (strNums[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.println(largestNumber(nums));
        }

    }
}

