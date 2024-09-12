package lec41;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        printArray(arr1);

        String[] arr2 = {"Hello","World"};
        //printArray function accept only integer array
        //printArray();


    }

    public static <T> void printArray(T[] arr)
    {
        for(T val : arr)
            System.out.println(val);
    }
}
