package lec35;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello");
        sb1.append(" ");
        sb1.append("World!");
        System.out.println("sb1: " + sb1.toString());

        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("Initial capacity example.");
        System.out.println("sb2: " + sb2.toString());

        StringBuilder sb3 = new StringBuilder("Java");
        sb3.append(" Programming");
        System.out.println("sb3: " + sb3.toString());


        sb3.insert(5, "Language ");
        System.out.println("After insert: " + sb3.toString());

        sb3.replace(5, 13, "");
        System.out.println("After replace: " + sb3.toString());

        sb3.reverse();
        System.out.println("After reverse: " + sb3.toString());

        sb3.delete(0, 10);
        System.out.println("After delete: " + sb3.toString());

    }
}
