package lec12;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=10;
        int ans=Seach(arr,target);
        System.out.println(ans);
    }
    public static int Seach(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
