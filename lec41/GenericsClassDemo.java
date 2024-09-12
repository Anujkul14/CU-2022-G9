package lec41;

class Box<T>
{
    private T item;

    public Box(T item)
    {
        this.item = item;
    }

    public void setItem(T item)
    {
        this.item = item;
    }

    public T getItem()
    {
        return item;
    }
}

public class GenericsClassDemo {
    public static void main(String[] args) {
                    Box <Integer> obj1 = new Box<>(10);
        System.out.println(obj1.getItem());

        Box <String> obj2 = new Box<>("Hello");
        System.out.println(obj2.getItem());
    }
}
