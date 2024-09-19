package lec46;
import java.util.Scanner;

class ReverseGreet extends Thread
{
    int n;
    ReverseGreet(int n){
    this.n=n;
}
    public void run(){
    System.out.println("CodeQuotient Thread"+n);
}
}

public class GreetingReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Thread threads[]=new Thread[n];
        for(int i=0;i<n;i++){
            threads[i]=new ReverseGreet(i+1);
        }
        for(int i=n-1;i>=0;i--){
            try{
                threads[i].start();
                threads[i].join();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
