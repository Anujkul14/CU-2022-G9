package lec13;

public class MaximumElement {
    public static void main(String[] args) {
        int arr[]={5,6,7,9,-10,20,8};
        Max(arr);
    }
    public static void Max(int arr[]){
        //int m=arr[0];
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=m){
                m=arr[i];
            }
        }
        System.out.println(m);
    }
}
