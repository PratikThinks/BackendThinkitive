package com.training.librarymanagement.impl;

import com.training.librarymanagement.entity.Student;
import com.training.librarymanagement.pojo.StudentPojo;
import com.training.librarymanagement.repository.BookRepo;
import com.training.librarymanagement.repository.StudentRepo;
import com.training.librarymanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Autowired
    BookRepo bookRepo;
    @Override
    public Student createStudent(StudentPojo stpojo) {
        Student student = new Student();
        student.setName(stpojo.getName());
        student.setId(stpojo.getId());
        student.setBooks(bookRepo.findByBookuidIn(stpojo.getBooksuidlist()));

        UUID uid = UUID.randomUUID();
        student.setUuid(uid);
            return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student s) {
        return studentRepo.save(s);
    }


    public Student getOneStudent(UUID uuid) {
       return studentRepo.findByUuid(uuid);
    }

}
