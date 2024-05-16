package Overloading;

public class OverloadingScenario2 {
    public static void main(String[] args) {
        m1(null); // nulll will support for string and object but the string arg method will get the chance because it is child of object class
    }
    public static void m1(String s){
        System.out.println("this is the string method");
    }

    public static void m1(Object o){
        System.out.println("This is object method");
    }
}
