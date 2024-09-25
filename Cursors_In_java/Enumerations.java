package Cursors_In_java;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerations{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=0;i<10;i++){
            v.addElement(i);
        }

        Enumeration e = (Enumeration) v.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer)e.nextElement();
            System.out.println(i);
        }
    }
}


//Enumeration is only for legacy classes and we can not perform remove operation