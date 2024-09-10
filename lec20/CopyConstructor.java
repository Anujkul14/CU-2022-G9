package lec20;

public class CopyConstructor {
    private String name;
    private int age;
    private String address;

    public CopyConstructor(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public CopyConstructor(CopyConstructor obj) {
        this.name = obj.name;
        this.age = obj.age;
        this.address = obj.address;
    }

    public void print() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void print(String additionalInfo) {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Additional info:" + additionalInfo);
    }

    public void printAge(int age) {
        System.out.println("Age: " + age); // This method prints a separate age parameter
    }

    public void printAge(double age) { // Method overloading for printing age (double)
        System.out.println("Age: " + age);
    }

    // Methods for printing name and age with different parameter order (method overloading)
    public void printNameAndAge(String name, int age) {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }

    public void printNameAndAge(int age, String name) {
        System.out.println("Age: " + age);
        System.out.println("Name:" + name);
    }
}
