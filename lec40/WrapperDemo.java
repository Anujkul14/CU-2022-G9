package lec40;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        //autoboxing
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al.size());
        //unboxing
        Integer val = al.get(1);
        int b = val;

        int sVal = Integer.valueOf("123");
        System.out.println(sVal);

    }

}
