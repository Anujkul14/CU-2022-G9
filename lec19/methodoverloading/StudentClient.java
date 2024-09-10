package lec19.methodoverloading;

public class StudentClient {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ankit");
        s1.setAge(19);
        s1.setAddress("Patiala");

        s1.print();
        s1.print("Chitkara University");

        s1.printAge(20);
        s1.printAge(20.2);

        s1.printNameAndAge("Arshdeep",24);
        s1.printNameAndAge(24,"Arshdeep");

    }
}
