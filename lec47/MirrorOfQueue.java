package lec47;
import java.util.Queue;
import java.util.Stack;

public class MirrorOfQueue {
//    public static void main(String[] args) {
//            Queue<String> queue = new LinkedList<>();
//            queue.add("Code");
//            queue.add("Quotient");
//
//            System.out.println("Original Queue: " + queue);
//
//            mirrorQueue(queue);
//
//            System.out.println("Mirrored Queue: " + queue);
//
//    }

    public static void mirrorQueue(Queue<String> queue) {
        Stack<String> stack = new Stack<>();  // Stack to reverse the order

        // Push all elements from the queue onto the stack
        for (String element : queue) {
            stack.push(element);
        }

        // Add elements from the stack back to the queue (in reverse order)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}

