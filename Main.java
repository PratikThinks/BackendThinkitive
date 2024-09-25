public class Main {

    static{
        System.out.println("We are in static block");
    }

    public static void main(String[] args){
        System.out.println("We are in main method"); //jvm will look for the main method which has the string array as argument
    }

    public static void main(String i){
        System.out.println("we are in another main method");
    }
}
