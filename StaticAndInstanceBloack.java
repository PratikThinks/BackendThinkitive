import javax.swing.*;

public class StaticAndInstanceBloack {
    public static void main(String[] args){
        System.out.println(Color.n);
        Color c = new Color();
    }

}

class Color{
    static{
        System.out.println("Hey i am inside the static block here");
    }

    public static int n = 34;
}
