package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(34);
        v.add(43);
        v.add(87);
        v.add(42);
        Stream st = v.stream();
        st.forEach(e->System.out.println("this is " + e));

    }
    
}
