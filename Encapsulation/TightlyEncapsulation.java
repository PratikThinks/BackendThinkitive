package Encapsulation;

public class TightlyEncapsulation {
    
}

class Shop{
    private int collection;       // Shop class is tighly encapsulated class

}
class Customer extends Shop{
    int balance;                    // Customer class is not tightly encapsulated class
}
class HouseWife extends Customer{
    private int savings;            // House wife class is not tighlty encapsulated
}
