package Overriding;

public class DynamicBinding {
    public static void main(String[] args) {
        CheifMinister c = new CheifMinister();
        c.fund();
        PrimeMinister p = new PrimeMinister();
        p.fund();
        CheifMinister c1 = new PrimeMinister();
        c1.fund(); // will call the child class method
    }
    


}

class CheifMinister{
    void fund(){
        System.out.println("I have 7 lakh crore of fund ");
    }
}

class PrimeMinister extends CheifMinister{
    void fund(){
        System.out.println("I have 25 lakh crore of fund ");
    }
}

