package Multithreading_In_Java;

public class UserDefinedThreaduisngClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("this is from main thread");
        SecondThread t2 = new SecondThread();
        Thread t = new Thread(t2);
        t.start();
        // int i = 10/0;

        Thread t4 = new Thread(){
            @Override
            public void run(){
                System.out.println(
                    "we are running the thread here"
                );
            }
        };
        t4.start();

    }
    
}


class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("yeah! new thread is performing");
    }
}

class SecondThread implements Runnable {

    @Override
    public void run(){
        System.out.println("i am thread which is created by the runnable interface");
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(1000);
                System.out.println("tik tik " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
