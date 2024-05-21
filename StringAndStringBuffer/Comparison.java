package StringAndStringBuffer;

// Object class equals method is meant for reference comparison but in stringbuilder it is not overridden as in case of string class it is overidden
public class Comparison {
    public static void main(String[] args) {
        String s = new String("Pratik");
        s.concat(" Kapratwar");
        System.out.println(s); // String objects immutable
        StringBuffer sb = new StringBuffer("Pratik");
        sb.append(" Kapratwar");
        System.out.println(sb); // Stringbuffer objects are mutable
    }
    
}
