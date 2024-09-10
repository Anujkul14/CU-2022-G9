package lec39;

class MyRunnable implements Runnable{
    public void run()
    {
        for(int i = 0;i < 5;i++)
            System.out.println(Thread.currentThread().getName() + " " + i);
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj,"Thread1");

        Thread t2 = new Thread(obj,"Thread2");

        t1.setPriority(2);
//        System.out.println(t1.getPriority());
        t1.start();
        t2.start();




    }



}
