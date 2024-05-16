package Overriding;

public class VarArgsMethod {

    public static void main(String[] args) {
        Test3 t = new Child3();
        t.m1(4,4);
    }
}

class Test3{
    void m1(int... x){
        System.out.println("I am from parent class ");
    }
}


class Child3 extends Test3{
    void m1(int x){
        System.out.println(" i am from the child class method");
    }
}
