package Abstract_Class;

public class PracticeOfAbstract {
    public static void main(String[] args) {
        // Dog d = new Dog();
        // System.out.println(d.number);
        
    }
}

abstract class Animal{
    int number;
    abstract void run();
    abstract void sleep();
    void eat(){
        System.out.println("he will eat anything");
    }

    Animal(){
        System.out.println("Animal constructor is running");
        this.number = 34;
    }
    
}

abstract class Dog extends Animal{
    void run(){
        System.out.println("dog will run fast");
    }
}


class Puppy extends Dog{
    void sleep(){
        System.out.println("Puppy sleeps for all the day");
    }
}
