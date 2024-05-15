public class StaticInnerClass {
    public static void main(String[] args){
        Upnode.Node.showInfo(); //Accessing static method inside the static inner class
        Upnode.Node n = new Upnode.Node();
        n.getInfo();  //Access the instance method of static inner class

        Upnode u = new Upnode(); // we can access the static and instance members of the inner class
        u.run();

    }
}

class Upnode{
    static int n;
    static class Node{
    String name;     // can not access this variable by the static inner class
        static void showInfo(){
            System.out.println("We are in the static innner class");
            System.out.println(n);
        }
        void getInfo(){
            System.out.println("I am instance method here");
            System.out.println(name);
        }
    }
    void run(){
        Node.showInfo();
    }



}
