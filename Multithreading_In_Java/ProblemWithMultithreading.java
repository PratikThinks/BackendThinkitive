package Multithreading_In_Java;

import java.util.ArrayList;
import java.lang.annotation.*;


class BalanceOver extends Exception{

}

class client{
    private static int balance = 2000;
    public int getBalance(){
        return this.balance;
        }
    public static int withdraw(int i){
        if(balance == 0){
            return 0;
        }
        else{
            balance = balance - i;
            return i;
        }
}
}
public class ProblemWithMultithreading {
    @SuppressWarnings("unchecked")
    ArrayList list = new ArrayList<>();



    public static void main(String[] args) {
        
        OurThread o = new OurThread();
        Thread t1 = new Thread(o,"Pratik");
        Thread t2 = new Thread(o,"Acharya");
        Thread t3 = new Thread(o,"Shivaji");
        t1.start();
        t2.start();
        t3.start();
    }
    
}
class OurThread implements Runnable{
    public void run(){
        client c = new client();
        int mymoney = c.withdraw(1000);
        System.out.println("i have withdraw " + mymoney);
    }
}
