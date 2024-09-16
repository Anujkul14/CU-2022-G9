package lec43;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println(hashSet);

        hashSet.add(50);
        hashSet.add(30);
        System.out.println(hashSet);

        hashSet.remove(50);
        //10 20 30 -> set content
        System.out.println(hashSet);

        Iterator <Integer> it = hashSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //10 20 30 -> set1 content
        //40 35 30 -set2
        HashSet <Integer> hashSet1 = new HashSet<>();
        hashSet1.add(40);
        hashSet1.add(35);
        hashSet1.add(30);

        //Union
        HashSet <Integer> unionSet = new HashSet<>(hashSet);
        unionSet.addAll(hashSet1);
        System.out.println(unionSet);

        //intersection
        HashSet <Integer> intersectionSet = new HashSet<>(hashSet);
        intersectionSet.retainAll(hashSet1);
        System.out.println(intersectionSet);

        //difference
        HashSet <Integer> DifferenceSet = new HashSet<>(hashSet);
        DifferenceSet.removeAll(hashSet1);
        System.out.println(DifferenceSet);




    }
}
