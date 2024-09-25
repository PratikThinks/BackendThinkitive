package Overriding;


// Overriding static method is called method hiding
public class StaticMethod {
    public static void main(String[] args) {
        Best t = new Best();
        t.m1();
        Best b = new Better();
        b.m1();

        Better b1 = new Better();
        b1.m1();
    }
}

class Best {
    public static void m1(){
        System.out.println("I am static mehtod from the parent class");
    }
}

class Better extends Best{
    public static void m1(){
        System.out.println("I am static method from the child class");
    }
}
