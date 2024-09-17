package lec44;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet <Integer> treeSet = new TreeSet<>();

        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(50);
        //insertion order -> 40 10 50
        //storing order -> 10 40 50
        System.out.println(treeSet);
        treeSet.add(15);
        //storing order -> 10 15 40 50
        System.out.println(treeSet);

//        treeSet.remove(10);
//        System.out.println(treeSet);

        //sorted set interface -> first(),last(),headSet(),TailSet()
        treeSet.first();//10
        treeSet.last();//50

        System.out.println(treeSet.headSet(20));
        System.out.println(treeSet.tailSet(14));
    }
}
