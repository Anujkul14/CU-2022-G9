package lec23;


class Shape
{
    int a = 5;
    void draw()
    {
        System.out.println("Shape Class");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Circle Class");
    }
}

class Square extends Shape
{
    int a = 10;
    void draw()
    {
        System.out.println("Square Class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape obj1 = new Shape();
        Circle obj2 = new Circle();
        Square obj3 = new Square();


        Shape ref;

        ref = obj1;
        ref.draw();//draw of shape called

        ref = obj2;
        ref.draw();

        ref = obj3;
        ref.draw();

        System.out.println(((Square)(ref)).a);

    }
}
