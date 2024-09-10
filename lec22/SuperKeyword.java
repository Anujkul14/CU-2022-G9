package lec22;

class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent constructor");
    }

    void method1() {
        System.out.println("Parent method1");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super(); // Call parent constructor
        System.out.println("Child constructor");
    }

    void method1() {
        System.out.println("Child method1");
        super.method1(); // Call parent's method1
    }

    void method2() {
        System.out.println("Child method2");
        System.out.println("x from Child: " + x);
        System.out.println("x from Parent: " + super.x); // Access parent's variable
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Child child = new Child();
        child.method1();
        child.method2();

    }
}

