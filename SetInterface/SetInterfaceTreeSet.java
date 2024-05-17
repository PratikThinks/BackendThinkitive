package SetInterface;

import java.util.ArrayList;
import java.util.TreeSet;

//Heterogenous objects are not allowed because sorting is required in this collection


// For tree to be sorting the element the object should be comparable ( implement comparable interfacae)
// String class have already implement comparable interface
public class SetInterfaceTreeSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4444);
        list.add(33);
        TreeSet<Integer> tree = new TreeSet<>(list);
        tree.add(45);
        tree.add(40);
        tree.add(90);

        System.out.println(tree);
    }
}
