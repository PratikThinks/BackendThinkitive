package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class SetHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(4);
        HashSet<Integer> set = new HashSet<>(list); //it will remove duplicate elements and convert the arraylist object to the hashset object
        System.out.println(set);
    }
    
}
