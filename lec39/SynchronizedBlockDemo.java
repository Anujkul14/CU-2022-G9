package lec39;

class Counter
{
    private int count;
    public void increment()
    {
        //synchronized Block
        synchronized (this) {
            count++;
        }
        //count++;
    }
    public int getCount()
    {
        return count;
    }
}

public class SynchronizedBlockDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable obj1 = new Runnable(){
            public void run()
            {
                for(int i = 0;i < 1000;i++)
                counter.increment();
            }
        };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 1000;i++)
                    counter.increment();
            }
        };

        Thread t1 = new Thread(obj1,"Thread 1");
        Thread t2 = new Thread(obj2,"Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
