package lec22.StaticKeyword;

class StaticExample {
    static int count = 0;

    static {
        System.out.println("Static block executed.");
        count = 10;
    }

    public static void staticMethod() {
        System.out.println("Static method called.");
        System.out.println("Count: " + count);
    }

    public void nonStaticMethod() {
        System.out.println("Non-static method called.");
        System.out.println("Count: " + count);
    }

    public static class InnerStaticClass {
        public void doSomething() {
            System.out.println("Doing something from InnerStaticClass");
        }
    }

}
public class Example2 {
    public static void main(String[] args) {
        System.out.println("Count: " + StaticExample.count);
        StaticExample.staticMethod();

        StaticExample obj = new StaticExample();
        obj.nonStaticMethod();

        StaticExample.InnerStaticClass innerObject = new StaticExample.InnerStaticClass();
        innerObject.doSomething();

    }
}


