package lec43;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Cat");
        linkedHashSet.add("Dog");
        linkedHashSet.add("Elephant");
        //output order same as insertion order
        System.out.println("LinkedHashSet: " + linkedHashSet);

        linkedHashSet.remove("Dog");
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        linkedHashSet.add("Cat");
        System.out.println("LinkedHashSet after adding duplicate: " + linkedHashSet);

    }
}
