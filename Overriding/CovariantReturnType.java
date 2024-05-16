package Overriding;

public class CovariantReturnType {
    // it is applicable only for the object class return type not for primitive
    public static void main(String[] args) {
        Developer m = new Manager();
        System.out.println(m.m1(0)); // return types of overridding method is different 
    }
    
}

class Developer{
    Object m1(int i){
        return new Object();
    }
}

class Manager extends Developer{
    String m1(int i){
        return "Pratik";
        }
}
