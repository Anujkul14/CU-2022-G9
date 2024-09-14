package lec34;

public class StringConstructor {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "G9,Shaant ho jao";

        byte[] arr1 = {70,80,110,120};
        String s3 = new String(arr1,1,2);

        char[] arr2 = {'a','b','c','d'};
        String s4 = new String(arr2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //int[] arr3 = {70,80,110,120};
        //String s5 = new String(arr3);


    }
}
