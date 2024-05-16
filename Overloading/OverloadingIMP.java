package Overloading;

public class OverloadingIMP {
    public static void main(String[] args) {
        Thinkitive t = new Thinkitive();
        Employee e = new Employee();
        Thinkitive t1 = new Employee();
        m1(t); // thinkitive verison 
        m1(e); // employee version 
        m1(t1); // thinkitive version (overloading - parent reference)
    }

    public static void m1(Thinkitive t){
        System.out.println("thinkitive version");
    }
    public static void m1(Employee e){
        System.out.println("Employee version");
    }
    
}


class Thinkitive{

}

class Employee extends Thinkitive{

}
