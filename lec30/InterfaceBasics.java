package lec30;

interface Drawable { void draw(); }

class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);

    }
}
public class InterfaceBasics {
    public static void main(String []args) {
        Drawable circle = new Circle(5);
        circle.draw();
    }
}
