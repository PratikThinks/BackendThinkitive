package Annotations;
import java.lang.annotation.*;
@Course
public class Student {

    String name;
    int roll;
    String college;
    Student(String name,int roll,String college){
        this.name= name;
        this.roll = roll;
        this.college = college;
    }
}
