package lec49;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FlipQueue {
    static void flipHalfQueue(Queue<Integer> q)
    {
        if (q.isEmpty()) {
            return;
        }

        Stack<Integer> oddStack = new Stack<>();
        Queue<Integer> tempQueue = new LinkedList<>();

        int size = q.size();
        for (int i = 0; i < size; i++) {
            int element = q.remove();
            if (i % 2 == 1) {
                oddStack.push(element);
            }
            tempQueue.add(element);
        }

        for (int i = 0; i < size; i++) {
            int element = tempQueue.remove();
            if (i % 2 == 1) {
                q.add(oddStack.pop());
            } else {
                q.add(element);
            }
        }
    }

}
