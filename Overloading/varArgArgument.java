package Overloading;

public class varArgArgument {
    public static void main(String[] args) {
        m1(34,34,55);
        m1(23);
        m1();
    }
    
    // static void m1(int i){
    //     System.out.println("int verison method");
    // }

    static void m1(float f){
        System.out.println("float version");
    }

    static void m1(int... i){  // this method will run for any number of int arg type it can be zero args also . Var args method get least priority means if  not other method is not matched then only var args method will get chance
        for(int i1:i){
            System.out.println(i1);
        }
        System.out.println("var args method");
    }
}
