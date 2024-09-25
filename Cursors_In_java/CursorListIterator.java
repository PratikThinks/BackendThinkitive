package Cursors_In_java;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListIterator {
    public static void main(String[] args) {
        // Write a program to remove the odd elements from the collection and if odd element is found then replace that element with the previous element

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        ListIterator itr = list.listIterator();

        while(itr.hasNext()){
            Integer i = (Integer)itr.next();
            System.out.println(i);
            
            }
        
    
    }
    
}


// we can move forward ,backward and can perform write,read and replace operation
//List iterator is only for List interface
