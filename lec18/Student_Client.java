package lec18;

public class Student_Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Hitesh");
        s1.setAge(19);
        s1.setAddress("Ambala");

        String name = s1.getName();
        int age = s1.getAge();
        String addr = s1.getAddress();

        s1.print();

        System.out.println("Name : " + name + " Age :" + age + " Address :" + addr); // Prints the student's information
    }
}
