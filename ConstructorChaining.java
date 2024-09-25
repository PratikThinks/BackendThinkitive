public class ConstructorChaining {

    public static void main(String[] args){
    Child c = new Child(7); // child class constructor will always call the parent class constructor irrespective of you call it or not

    }
}

class Parent{
    Parent(){
        System.out.println("we are in parent class constructor");
        int x = 34;
        int y = 34;
        System.out.println(x+y);
    }
    Parent(int i){
        System.out.println("I am Parent class paramterized constructor");
    }

}

class Child extends Parent{

    Child(){
        super(7);
        System.out.println("we are in non parameterized constructor of the Child class ");
    }
    Child(int i){
        this();
        System.out.println("we are in child class consturctor with int parameter");
    }
}



