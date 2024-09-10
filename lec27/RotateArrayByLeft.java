package lec27;

public class RotateArrayByLeft {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        k = k % n;
        //k = n - k;
        //Reverse(arr,0,n-1);
        //Reverse(arr,0,k-1);
        //Reverse(arr,k,n-1);
        //no change in k
        Reverse(arr,0,n-1);
        Reverse(arr,0,n - k-1);
        Reverse(arr,n - k,n-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        };
    }
    public static void Reverse(int arr[],int low,int high){
        while (low<=high){
            int item=arr[low];
            arr[low]=arr[high];
            arr[high]=item;
            low++;
            high--;
        }
    }
}
