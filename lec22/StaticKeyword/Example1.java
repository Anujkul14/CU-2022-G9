package lec22.StaticKeyword;

class Counter {
    static int count = 0;

    static void increment() {
        count++;
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        System.out.println("Count: " + Counter.count);

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        c2.displayCount();

    }
}

