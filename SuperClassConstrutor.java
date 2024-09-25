import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SuperClassConstrutor {
    public static void main(String[] args){
        System.out.println("we are inside the main class here");
        GrandChild g = new GrandChild();
        
    }
    
}

class Parent1{
    Parent1(){
        System.out.println("we are inside the parent class constructor here");
    }
}

class Child1 extends Parent1{
    Child1(){
        System.out.println("we are inside the child class constructor here");
    }
}

class GrandChild extends Child1{
    GrandChild(){
        System.out.println("we are inside the grandchild class constructor here");
    }
}