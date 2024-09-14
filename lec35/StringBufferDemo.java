package lec35;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        //initial capacity : 16
        System.out.println(sb1.capacity());
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer(50);
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("Hello G9");
        //initial capacity + length of the string
        System.out.println(sb3.capacity());
        System.out.println(sb3);

        System.out.println(System.identityHashCode(sb3));
        sb3.append("Chitkara");
        System.out.println(System.identityHashCode(sb3));

        //insert at specified position
        sb3.insert(2,"abc");
        System.out.println(sb3);

        //replace from the the range given with the the string given in the parameter
        sb3.replace(2,5," ");
        System.out.println(sb3);

        sb3.delete(6,sb3.length());
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer("Hello");
        StringBuffer sb5 = sb4.append(" G9");

        //checks contents of both string
        StringBuffer sb6 = new StringBuffer("Bye");
        System.out.println(sb4 ==  sb5);

        //refernce compare
        System.out.println(sb4.equals(sb6));


    }
}
