package StreamAPI;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Stream;

public class FilterFromStream {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(53);
        list.add(89);
        list.add(90);
        Stream st = list.stream();
        st.filter(p->((int)p%2==0)?true:false).forEach(p->System.out.print(p + " "));
        System.out.println();
    }
    
}
