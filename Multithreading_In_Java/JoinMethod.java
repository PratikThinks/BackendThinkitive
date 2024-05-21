package Multithreading_In_Java;

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException{
        NewThread t1 = new NewThread();
        t1.start();
        t1.join();
        System.out.println("main has finished now");
    }
    
}

class NewThread extends Thread{
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("we are from the customized thread stacks");
    }
}