package lec28;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args)
    {
        int row;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        int arr[][] = new int[row][];

        for(int i = 0;i < row;i++)
        {
            int col = sc.nextInt();
            arr[i] = new int[col];
        }

        int count = 1;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
