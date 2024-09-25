package Annotations;

import java.util.ArrayList;

class Hospital{
    @SuppressWarnings("unchecked")
    public ArrayList getpatientDetails(){
        ArrayList list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        return list;
    }
}

public class SupressWarningAnnotation {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        System.out.println(h.getpatientDetails());
    }   
}
