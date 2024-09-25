package Cursors_In_java;
import java.util.*;
import java.util.ArrayList;
import java.util.Stack;


public class Cursor2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(2);
        s.push(3);

        Iterator<Integer> i =  s.iterator();
        while(i.hasNext()){
            Integer num = i.next();
        }
    }
    
}

//Iterator is universal curso . It is applicable for any collection implemented class by using iterator we can perform both read and remove operation
