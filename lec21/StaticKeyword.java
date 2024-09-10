package lec21;

public class StaticKeyword {
    static int a = 5;
    int b = 20;
    static {
        System.out.println("Static block executed once");
    }

    static void print() {
        a = 20;
    }

    public static void main(String[] args) {
        StaticKeyword.a = 10;
        System.out.println(StaticKeyword.a);
    }
}
