package lec41;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        Object[] arr = new Object[5];

        arr[0] = 10;
        arr[1] = new StringBuilder("Hello");
        arr[2] = 'A';

        ((StringBuilder)arr[1]).append(" G9");
        System.out.println(arr[1]);

        if(arr[0] instanceof StringBuilder)
            ((StringBuilder)arr[0]).append(" Chitkara");

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        //type safety
        //al.add("Hello");
    }
}
