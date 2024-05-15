public class Anonymous {

    public static void main(String[] args) {
        System.out.println(Ex3.a);
        var obj = new Object(){  // creating object directly into the variable
            public void me(){
                System.out.println("I am running");
            }
        };
        obj.me();
    }
    
}

class Ex3{
    public static int a = 34;

}
