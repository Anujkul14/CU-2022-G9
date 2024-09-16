package lec43;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //add element at end
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);

        //remove element from front
        pq.poll();
        System.out.println(pq);

        //return element from front
        System.out.println(pq.peek());


    }
}
