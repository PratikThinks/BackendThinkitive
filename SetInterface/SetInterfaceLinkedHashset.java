package SetInterface;

import java.util.LinkedHashSet;

public class SetInterfaceLinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(34);
        set.add(45);
        set.add(55);
        System.out.println(set.add(45));
        System.out.println(set);
        if(set.contains(55)){
            System.out.println("yes,I got the element");
        }
    }
    
}

// it is just the ordered version of the hashset 
