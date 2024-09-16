package lec43;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.offer("Alpha");
        linkedList.offer("Beta");
        linkedList.offer("Gamma");

        System.out.println("Size of LinkedList: " + linkedList.size());

        linkedList.poll();
        System.out.println("LinkedList after removal: " + linkedList);

        linkedList.offer("Delta");
        System.out.println("Element at the head (peek): " + linkedList.peek());
        System.out.println("Removing element (poll): " + linkedList.poll());

        linkedList.addFirst("First Element");
        linkedList.addLast("Last Element");
        System.out.println("LinkedList after adding first and last: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing first and last: " + linkedList);

        Iterator<String> iterator = linkedList.iterator();
        System.out.println("Iterating through LinkedList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
