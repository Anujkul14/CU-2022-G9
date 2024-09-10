package lec31;
import java.util.*;
class Student {

    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Overrides the default toString() method
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {

    // Overrides the compare() method
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;  // Subtracting roll numbers to determine order
    }
}

class Example3 {

    public static void main(String[] args) {

        Student[] arr = new Student[4];

        arr[0] = new Student(484, "JaiVardhan", "london");
        arr[1] = new Student(409, "Kartavya", "nyc");
        arr[2] = new Student(421, "Tiwari", "jaipur");
        arr[3] = new Student(429, "Alakh Pandey", "Hongkong");

        System.out.println("Unsorted");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        Arrays.sort(arr, new Sortbyroll());

        System.out.println("\nSorted by rollno");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
/*
Comparator Interface:
The Comparator interface is used to define a custom ordering of objects. In this
example, the Sortbyroll class implements the Comparator<Student> interface to sort
Student objects by their roll numbers in ascending order.
The compare() method in the Comparator interface is overridden to define the
comparison logic.

Arrays.sort() Method:
The Arrays.sort() method is used to sort arrays in Java. When sorting objects, you
can pass a custom Comparator to this method to define the order in which the objects
should be sorted.
*/