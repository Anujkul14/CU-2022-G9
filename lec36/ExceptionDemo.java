package lec36;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        try
        {
            if(age < 0)
                throw new Exception("Age can not be negative");

            //normal flow
            System.out.println("Correct Age");
        } catch (Exception e) {
            System.out.println("Please enter correct age");
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());

        }
        finally{
            System.out.println("Final Block");
        }
    }
}
