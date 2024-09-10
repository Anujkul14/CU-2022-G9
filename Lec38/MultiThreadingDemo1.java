//package Lec38;
//
//class ThreadDemo1 implements Runnable{
//    private String threadName;
//    public ThreadDemo1(String name)
//    {
//        threadName = name;
//    }
//    public void run()
//    {
//        for(int i = 0;i < 5;i++)
//        {
//            System.out.println(threadName + " " + i);
//        }
//    }
//
//}
//
//public class MultiThreadingDemo1 {
//    public static void main(String[] args) {
//        ThreadDemo1 t3 = new ThreadDemo1("T1 Runnable");
//        ThreadDemo1 t4 = new ThreadDemo1("T2 Runnable");
//
//        t3.start();
//        t4.start();
//    }
//}
//
//
