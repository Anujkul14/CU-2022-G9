package lec43;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("John");
        vector.add("Doe");
        vector.add("Jane");

        System.out.println("Size of Vector: " + vector.size());

        vector.remove("Doe");
        System.out.println("Vector after removal: " + vector);

        vector.add(1, "Alex");
        System.out.println("Element at index 1: " + vector.get(1));

        vector.set(2, "Mary");
        System.out.println("Vector after set: " + vector);

        Iterator<String> iterator = vector.iterator();
        System.out.println("Iterating through Vector:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}



