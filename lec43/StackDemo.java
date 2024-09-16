package lec43;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.add(10);
        st.add(20);
        st.add(5);
        st.push(50);

        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());

        List<Integer> st1 = new Stack<>();

        ((Stack)st1).push(20);

    }
}
