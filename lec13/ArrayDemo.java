package lec13;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // int arr[]={5,6,7,8,9,10};
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);;
        }
    }
}
