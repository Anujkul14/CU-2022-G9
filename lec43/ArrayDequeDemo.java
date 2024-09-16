package lec43;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque <Integer> arrayDeque = new ArrayDeque<>();

        //queue interface methods -> offer,peek,poll
        arrayDeque.offer(10);
        arrayDeque.offer(50);
        arrayDeque.offer(5);
        //10 50 5,peek element -> 10
        System.out.println(arrayDeque.peek());
        arrayDeque.poll();
        System.out.println(arrayDeque);
        //deque interface methods -> addFirst(),addLast(),removeFirst(),removeLast()
        arrayDeque.addFirst(100);
        System.out.println(arrayDeque);

        arrayDeque.removeLast();
        System.out.println(arrayDeque);


    }
}
