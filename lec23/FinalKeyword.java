package lec23;

final class A {
    final void print() {
        System.out.println("Final method in class A");
    }
}

//class B extends A {
//    void print1() {
//        System.out.println("Class B");
//    }
//}

public class FinalKeyword {
    // Define a final instance variable a (must be initialized in constructor)
    final int a;

    // Constructor to initialize a
    public FinalKeyword() {
        // Initialize a with value 20
        a = 20;
    }
    public static void main(String[] args) {
        // Create an object of Final_Variable
        FinalKeyword obj = new FinalKeyword();

    }

}

