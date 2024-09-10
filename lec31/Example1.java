package lec31;

interface GeometricObject
{
    int x = 10;
    double getPerimeter();

    double getArea();

    void print();

    static void fun1()
    {
        System.out.println("Static method in Geometric Interface");
    }

    default void fun2()
    {
        System.out.println("default method in interface, may or may not be overridden");
        fun3();
    }

    default void fun4()
    {
        System.out.println("default method 2 in interface, may or may not be overridden");
        fun3();
    }

        private void fun3()
    {
        System.out.println("Used to avoid code duplication");
    }
}

interface Resizable
{
    void resize(int percent);

    void print();
}

class Circle implements GeometricObject, Resizable
{
    double radius;
    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(int percent)
    {
        this.radius = radius * percent / 100.0;
    }

    @Override
    public void print()
    {
        System.out.println("Print method present in both interfaces");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Circle obj = new Circle(5);

        System.out.println("Radius: " + obj.radius);
        System.out.println("Perimeter: " + obj.getPerimeter());
        System.out.println("Area: " + obj.getArea());

        obj.resize(10);
        System.out.println("Resized Circle radius: " + obj.getRadius());
        System.out.println("Resized Circle perimeter: " + obj.getPerimeter());
        System.out.println("Resized Circle area: " + obj.getArea());

        GeometricObject.fun1();

        obj.fun2();
        obj.fun4();
    }
}

/*
Interfaces: An interface in Java is a reference type, similar to a class,
that can contain only constants, method signatures, default methods, static methods,
and nested types. Interfaces cannot contain instance fields or constructors.
A class implements an interface, thereby inheriting the abstract methods of the
interface.

Static Methods in Interfaces: Static methods in interfaces are not inherited by
implementing classes. They can be called using the interface name.

Default Methods in Interfaces: Default methods allow the interface to provide a
default implementation of a method. Implementing classes can override default methods
if needed.

Private Methods in Interfaces: Private methods in interfaces are used to avoid code
duplication within default methods or static methods. These private methods are only
accessible within the interface and cannot be accessed by implementing classes.

Multiple Inheritance via Interfaces: A class can implement multiple interfaces, which
allows Java to support a form of multiple inheritance. The implementing class must
provide implementations for all abstract methods in the interfaces.

Overriding Methods: When a class implements an interface, it must override all
abstract methods defined in the interface(s). If two interfaces contain methods with
the same signature, the implementing class can provide a single implementation that
satisfies both interfaces.

 */
