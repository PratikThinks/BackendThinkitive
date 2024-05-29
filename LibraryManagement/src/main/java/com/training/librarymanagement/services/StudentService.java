package com.training.librarymanagement.services;


import com.training.librarymanagement.entity.Student;
import com.training.librarymanagement.pojo.StudentPojo;

import java.util.UUID;

public interface StudentService {
    public Student createStudent(StudentPojo s);
    public Student updateStudent(Student s);
    public Student getOneStudent(UUID uuid);

}
