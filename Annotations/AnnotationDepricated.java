package Annotations;

class MyApp{
    @Deprecated
    public void getServive(){
        System.out.println("you will get the good service now");
    }
    public void getNewService(){
        System.out.println("this is our updated service now");
    }
}

public class AnnotationDepricated {
    public static void main(String[] args) {
        MyApp a = new MyApp();
        a.getServive();
    }
    
}
