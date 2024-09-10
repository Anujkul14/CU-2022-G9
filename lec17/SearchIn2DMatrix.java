package lec17;

public class SearchIn2DMatrix {
    class Solution {
        public boolean searchMatrix(int[][] arr, int target) {
            int row = arr.length - 1;
            int col= 0;
            while(row >= 0 && col < arr[0].length){
                if(arr[row][col]==target){
                    return true;
                }
                else if(arr[row][col]>=target){
                    col--;
                }
                else{
                    row++;
                }
            }
            return false;
        }
    }
}
