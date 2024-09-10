package Lec38;
class ThreadDemo extends Thread{
    private String threadName;
    public ThreadDemo(String name)
    {
        threadName = name;
    }
    public void run()
    {
        for(int i = 0;i < 5;i++)
        {
            System.out.println(threadName + " " + i);
        }

    }

}

public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1 = new ThreadDemo("thread1");
        ThreadDemo t2 = new ThreadDemo("thread2");

        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println("main thread");
        System.out.println(t1.isAlive());
        t2.join();

    }
}
