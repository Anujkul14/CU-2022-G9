package lec43;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(10);

        System.out.println(linkedList);

//        linkedList.remove();
//        System.out.println(linkedList);
//
//        linkedList.remove(1);
//        System.out.println(linkedList);

        Iterator it = linkedList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
