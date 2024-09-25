package StreamAPI;

import java.util.Stack;

public class MapFromStream {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Pratik");
        st.push("Achaarya");
        st.push("India");
        st.push("Mang0");
        st.stream().map(p->{return p+ " my string";}).forEach(e->System.out.println(e));
        st.stream().sorted().forEach(e->System.out.println(e));
        
    }
    
}
