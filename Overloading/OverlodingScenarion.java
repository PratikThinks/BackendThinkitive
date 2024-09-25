package Overloading;


public class OverlodingScenarion {
    public static void main(String[] args) {
        m1(4.4f);
        // m1(12.5); // CE:can not find symbol
    }   
    
    
    public static void m1(float f){
        System.err.println("this is float argument mehtod");
    }
    public static void m1(int i){
        System.out.println("This is the int argument");
    }
}
