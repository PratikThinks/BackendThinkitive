public class DefaultConstructor {

    String name;
    int a;

    public void getValues(){
        System.out.println(name);
        System.out.println(a);
    }
    public static void main(String[] args){
    DefaultConstructor d = new DefaultConstructor();
    d.getValues();
    }
}
