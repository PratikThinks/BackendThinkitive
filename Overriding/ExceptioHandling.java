package Overriding;

import java.io.IOException;

public class ExceptioHandling {
    public static void main(String[] args) {
        Child c = new Child();
        try {
            c.m1();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in the code");
        }
    }
    
}

class Test{
    void m1() throws Exception{
        System.out.println("this is throwing runtime exception");
    }
}

class Child extends Test{
    void m1() throws IOException{
        System.out.println("it is throwing IndexOutOfBoundException");
    }
}
