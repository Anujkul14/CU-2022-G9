package lec20;

public class ParameterisedConstructor {
    private String name;
    private int age;
    private String address;

    //Constructor
    public ParameterisedConstructor(String name,int age,String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public void print()
    {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void print(String additionalinfo)
    {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Additional info:" + additionalinfo);
    }

    public void printAge(int age)
    {
        System.out.println("Age: " + age);
    }

    public void printAge(double age)
    {
        System.out.println("Age: " + age);
    }

    public void printNameAndAge(String name,int age)
    {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
    }

    public void printNameAndAge(int age,String name)
    {
        System.out.println("Age: " + age);
        System.out.println("Name:" + name);
    }
}
