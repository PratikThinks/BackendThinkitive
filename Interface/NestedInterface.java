package Interface;

public class NestedInterface {
    public static void main(String[] args){
        Vegetable v = new Vegetable();
        v.colour();
        
    }
    
}

interface Fruit{
    interface SweetFruits{
        void taste();
    }
}


class Mango implements Fruit.SweetFruits{
    public void taste(){
        System.out.println("mango has a sweet taste");
    }
}


class Vegetable{
    interface leafyVegetable{
        void listOfVitamins();
    }

    public void colour(){
        System.out.println("vegetables has variaty of colours");
    }
}

class Spinach implements Vegetable.leafyVegetable{
    public void listOfVitamins(){
        System.out.println("spinach contains vit A in large amount");
    }
}