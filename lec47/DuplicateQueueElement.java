package lec47;
import java.util.Queue;

public class DuplicateQueueElement {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//
//        System.out.println("Original Queue: " + queue);
//
//        doubleQueue(queue);
//
//        System.out.println("Queue after duplication: " + queue);
//    }

    static void doubleQueue(Queue<Integer> q)
    {
        int s =  q.size();
        for(int i = 0;i < s;i++)
        {
            int temp = q.poll();
            q.offer(temp);
            q.offer(temp);
        }
    }
}

