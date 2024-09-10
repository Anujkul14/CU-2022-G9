package lec12;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
