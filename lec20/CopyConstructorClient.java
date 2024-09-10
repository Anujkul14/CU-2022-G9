package lec20;

public class CopyConstructorClient {
    public static void main(String[] args) {
            CopyConstructor s1 = new CopyConstructor("Ankit",19,"Patiala");
            //Copy Constructor
            CopyConstructor s2 = new CopyConstructor(s1);


        }

    }

