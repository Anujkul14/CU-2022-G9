package lec27;

class Singleton {
    static Singleton instance = null;
    int a = 10;

    private Singleton() {
        System.out.println("Private Constructor");
    }

    static public Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        // Singleton obj1 = new Singleton();

        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj2);
        System.out.println(obj3);
    }
}



