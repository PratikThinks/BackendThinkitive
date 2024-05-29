package com.training.librarymanagement.controller;

import com.training.librarymanagement.entity.Book;
import com.training.librarymanagement.entity.Librarian;
import com.training.librarymanagement.entity.Student;
import com.training.librarymanagement.pojo.StudentPojo;
import com.training.librarymanagement.repository.BookRepo;
import com.training.librarymanagement.repository.StudentRepo;
import com.training.librarymanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentService studentService;

    @Autowired
    BookRepo bookRepo;

    @PostMapping
    public Student save(@RequestBody StudentPojo s){
        System.out.println(s);
        return studentService.createStudent(s);
//        return bookRepo.findByBookuidIn(s.getBooksuidlist());

    }


    @GetMapping("/{uuid}")
    Student getStudent(@PathVariable UUID uuid){
        return studentService.getOneStudent(uuid);
    }

    @PostMapping("/updateStudent")
    Student update(@RequestBody Student s){
        Student s1 = studentRepo.findByUuid(s.getUuid());
        s.setUuid(s1.getUuid());
        return studentRepo.save(s);
    }

    @GetMapping
    List<Student> getAll(){
        return studentRepo.findAll();
    }
    @DeleteMapping("/{id}")
    List<Student> delete(@PathVariable int id){
        Student s = studentRepo.deleteById(id);
        return studentRepo.findAll();
    }
}
