package Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.getBalance(); 
        Father f = new Father();
        //f.myEarnings();   // CE: myEarning is undefined for the type father
        
        Father f1 = new Child(); // parent reference child object
        f1.getBalance();
        //f1.myEarning(); // CE: myEarning is undefined for the type father

       // Child c = new Father(); // CE:incompatible type father can not be converte to child
    }
    
}


class Father{
    int bankBalance;
    String home;
    public void getBalance(){
        System.out.println("I have $100B in my account");
    }
}

class Child extends Father{
    String marriageDecision;
    public void myEarnings(){
        System.out.println(" I have earned ₹100B ");
    }
}
