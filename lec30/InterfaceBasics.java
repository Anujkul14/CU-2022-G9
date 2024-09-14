package lec30;

interface Drawable {
    //Data memeber by default -> public static final
    int a = 10;
    //method memeber -> public
    void draw(); }

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
        Circle obj = new Circle(10);
        Drawable circle = new Circle(5);
        circle.draw();
    }
}
