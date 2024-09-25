package Multithreading_In_Java;

public class SynchronizationInMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CustThread(),"Pratik");
        Thread t2 = new Thread(new CustThread(),"Acharya");
        t1.start();
        t2.start();
    }
    
}

class Table{
    public static synchronized int sum(int i){
        int mysum = 0;
        for(int j=0;j<i;j++){
            try {
                Thread.sleep(1000);
                System.out.println("mysum value is " + mysum);
            } catch (Exception e) {
                // TODO: handle exception
            }
            mysum = mysum + 10;
        }
        return mysum;
    }
}


class CustThread implements Runnable{
    public void run(){

        Table t = new Table();
        int sum = t.sum(3);
        System.out.println(sum);
    }
}
