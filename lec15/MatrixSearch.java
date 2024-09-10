package lec15;
import java.util.Scanner;
public class MatrixSearch {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[m][n];
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int k = scn.nextInt();
        System.out.print(searchMatrix(arr, k));
    }
    public static int searchMatrix(int[][] arr, int k) {
        // Write your code here
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == k) {
                return 1;
            }
            else if (arr[i][j] > k) {
                j--;
            }
            else {
                i++;
            }
        }
        return -1;
    }
}
