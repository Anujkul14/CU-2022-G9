package lec34;

public class StringDemo {
    public static void main(String[] args) {
            String s1 = "G9";
            String s2 = "G9";
            String s3 = "g9";

            String s4 = new String("G9");
            String s5 = new String("G9");

            System.out.println(System.identityHashCode(s1));
            System.out.println(System.identityHashCode(s2));
            System.out.println(System.identityHashCode(s3));
            System.out.println(System.identityHashCode(s4));
            System.out.println(System.identityHashCode(s5));

            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
            System.out.println(s2 == s4);
            System.out.println(s4 == s5);

            int[] arr = new int[5];
            System.out.println(arr.length);
            System.out.println(s1.length());

    }
}
