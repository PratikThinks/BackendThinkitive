public class StaticVariable {
    public static void main(String[] args){
        Table t = new Table();
        Table.legs = 4;
        Table t2 = new Table();
        t.getLegs();
        t2.getLegs();

    }
}

class Table{
    public static int legs;
    String colour = "Green";
    public void getLegs(){
        System.out.println("I have "+legs + " legs" );
    }


}
