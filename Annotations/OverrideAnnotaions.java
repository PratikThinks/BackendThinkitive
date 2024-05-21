package Annotations;

public class OverrideAnnotaions {
    public static void main(String[] args) {
        A a = new A();
        // A.getDriver();
    }
    
}

class A{
    public void getDriver(){
        System.out.println("this is driver no 1");
    }
}
class B extends A{
    @Override
    public void getDriver(){
        System.out.println("this is driver no 4");
    }
}

