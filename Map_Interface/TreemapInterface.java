package Map_Interface;

import java.util.TreeMap;

public class TreemapInterface {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        tree.put(2,20 );
        tree.put(5,50);
        tree.put(1, 10);
        tree.keySet().forEach(k->System.out.println(k));
    }

    
    
}
