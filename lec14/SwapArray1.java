package lec14;

public class SwapArray1 {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,8};
        System.out.println(arr[0]+" "+arr[1]);
        Swap(arr[0],arr[1]);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
