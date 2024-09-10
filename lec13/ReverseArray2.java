package lec13;

public class ReverseArray2 {
    public static void reverseArray(int[] arr)
    {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }

        System.out.print("Reversed Array: ");
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] originalArr = { 1, 2, 3, 4, 5 };
        reverseArray(originalArr);
    }
}
