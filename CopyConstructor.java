public class CopyConstructor {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle(v);
        System.out.println(v);
        System.out.println(v1); // Copying the object values in the another of the same type through copy constructor is called copy constructor
    }
}

class Vehicle{

    int tires;
    String model;
    Vehicle(Vehicle v){
        this.tires = v.tires;
        this.model =v.model;

    }
    Vehicle(){

    }
}
