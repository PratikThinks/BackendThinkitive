package Overloading;

public class OverloadingScenario3 {
    public static void main(String[] args) {
        //m1(null); // CE: reference to m1 is ambigious because both methods are matched
        //m1(10,10); // CE: reference to add is ambigious because both methods are mathced
        //m1(23.4f,23.5f); //CE: can not find symbol
    }

    public static void m1(String s){
        System.out.println("String version");
    }

    public static void m1(StringBuffer sb){
        System.out.println("stringbuffer version");
    }

    public void add(int i,float f){
        System.out.println("int - float version");
    }

    public void add(float f,int i){
        System.out.println("float - int verison");
    }
}
