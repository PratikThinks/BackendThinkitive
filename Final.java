public class Final {
    private class Node{
        int data;
        Node next ;

    }
    public static void main(String[] args){
        System.out.println("we are in the final class here");
        final int i =34; // we can not change the final variable once initialized
    }

}

class Pm{
    String location;
    final void getName(){
        System.out.println("Narendra Modi is the pm now");

    }
}

class Cm extends Pm{

//    void getName(){
//        System.out.println("Eknaath shinde is cm of maharashtra");
//    }     // we can not override the final class
}

final class ChiefJustice{
    void getName(){
        System.out.println("D Chandrachud is the CJI " ); // Final class can not be extended
    }
}
