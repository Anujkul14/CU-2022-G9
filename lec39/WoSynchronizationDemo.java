package lec39;

class BankAccount
{
    private int balance = 1000;

    public synchronized void withdraw(int amount)
    {
        if(balance > amount)
        {
            System.out.println(Thread.currentThread().getName() + " is withdrawing");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "Completed withdrawal" + "New Balance :" + balance);
        }
        else {
            System.out.println("Insufficient Balance for " + Thread.currentThread().getName());
        }
    }
}

public class WoSynchronizationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable obj1 = new Runnable(){
            public void run()
            {
                account.withdraw(700);
            }
        };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                account.withdraw(500);
            }
        };

        Thread person1 = new Thread(obj1,"Harmeet");
        Thread person2 = new Thread(obj2,"Harshit");

        person1.start();
        person2.start();


    }
}
