package lec24;

abstract class Shape {
    int a;

    public Shape() {
        a = 10;
    }

    public abstract void draw();

    public void print() {
        System.out.println("Abstract Class Shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Shape obj1 = new Circle();

        Circle obj2 = new Circle();
    }
}



