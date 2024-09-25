package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class StringWithComparator {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new myPreference());
        tree.add("null");
        tree.add("Pratik");
        tree.add("arabhu");
        System.out.println(tree);
    }
    
}

class myPreference implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        if(s1.charAt(0)>s2.charAt(0)){
            return +1;
        }
        else if(s1.charAt(0) <s2.charAt(0)){
            return -1;
        }
        return 0;
    }
}
