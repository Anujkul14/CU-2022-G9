package lec47;

import java.util.LinkedHashSet;
import java.util.Vector;

public class RemoveDuplicatesFromVector {
//    public static void main(String[] args) {
//        Vector<Integer> vector = new Vector<>();
//        vector.add(10);
//        vector.add(20);
//        vector.add(10);
//        vector.add(30);
//        vector.add(40);
//        vector.add(30);
//
//        System.out.println("Original Vector: " + vector);
//
//        removeDuplicates(vector);
//
//        System.out.println("Vector after removing duplicates: " + vector);
//    }

    public static void removeDuplicates(Vector<Integer> v) {
        //keeping all elements of vector in a set,as set do not contains duplicates
        //using LinkedHashSet as we need to maintain the order as well
        LinkedHashSet<Integer> set = new LinkedHashSet<>(v);
        v.clear();
        v.addAll(set);
    }
}

