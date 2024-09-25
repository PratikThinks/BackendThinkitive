package Multithreading_In_Java;

public class WaitMethod {
    public static void main(String[] args) {
        
    }
    
}

class CustomThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " has started the execution");
        
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(Thread.currentThread().getName() + " is sending the notification to waiting thread");
    }
}
