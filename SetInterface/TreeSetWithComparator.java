package SetInterface;
import java.util.*;


public class TreeSetWithComparator {
    
    public static void main(String[] args) {
        String[] name = {"Pratik","Balaji","Krishan","Prashant"};
        int[] roll = {4,2,1,5};
        TreeSet<Student> tree = new TreeSet(new myComparator());
        for(int i=0;i<name.length;i++){
            tree.add(new Student(roll[i], name[i]));
        }
        Iterator<Student> itr = tree.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.roll);
        }
        
    }
    
}

class Student{
    int roll;
    String name;
    Student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
}

class myComparator implements Comparator{

    @Override
    public int compare(Object arg0, Object arg1) {
        Student s1 = (Student) arg0;
        Student s2 = (Student) arg1;
        if(s1.roll > s2.roll){
            return +1;
        }
        if(s1.roll < s2.roll){
            return -1;
        }
        return 0;
    }
    

    
}


//comparable meant for default sorting order and comparator is meant for customized sorting order