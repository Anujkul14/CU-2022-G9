package lec41;

class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal
{
    public void bark()
    {
        System.out.println("Cat is barking");
    }
}

class AnimalShelter<T extends Animal>
{
    private T animal;

    public AnimalShelter(T animal)
    {
        this.animal = animal;
    }

    public void showAnimal()
    {
        animal.eat();
    }
}

public class BoundedGenericsDemo {
    public static void main(String[] args) {
        AnimalShelter <Dog> obj = new AnimalShelter<>(new Dog());
        obj.showAnimal();

        //AnimalShelter<Integer> obj2 = new AnimalShelter<>(10);
    }
}
