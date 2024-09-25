package Abstract_Class;

public class AnonymousAbstractClass {
    public static void main(String[] args) {
        Creature dog = new Creature() {
            void sleep(){
                System.out.println("Dog is sleeping in the home");
            }
        };
        dog.sleep();
    }
    
}

abstract class Creature{
    abstract void sleep();
}
