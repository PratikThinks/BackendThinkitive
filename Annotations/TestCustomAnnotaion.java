package Annotations;

import java.text.Annotation;

public class TestCustomAnnotaion {
    public static void main(String[] args) {
        Student s = new Student("Pratik",10 , "PVGCOET Pune");
        Class c = s.getClass();
        java.lang.annotation.Annotation an = c.getAnnotation(Course.class);
        Course crs = (Course) an;
        System.out.println(crs.cid());
    }
    
}
