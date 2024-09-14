package lec34;

public class StringAddition {
    public static void main(String[] args) {
        String s1 = "Hello,";
        String s2 = "G9";

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        String s5 = s2.concat(s1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        String s6 = s1 + "Chitkara";
        String s7 = "Chitkara" + "University";

        System.out.println(s6);
        System.out.println(s7);

        //string + anything = string
        System.out.println("Hello" + 6 + 10 + "Chandigarh");

        System.out.println(10 + 20 + "Hello" + 6 + "Chitkara");

        System.out.println("Hello" + (6 + 10) + "Chandigarh");



    }
}
